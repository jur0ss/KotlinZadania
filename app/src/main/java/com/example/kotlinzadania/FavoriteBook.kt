package com.example.kotlinzadania

import com.example.kotlinzadania.BookManager.books

data class Book(val title: String, val author: String, val year: Int)

object BookManager
{
    val books = mutableListOf(
        Book("Wielki Gatsby", "F. Scott Fitzgerald", 1925),
        Book("Czuła jest noc", "F. Scott Fitzgerald", 1934),
        Book("Rok 1984", "George Orwell", 1949),
        Book("Folwark zwierzęcy", "George Orwell", 1945),
        Book("Zabić drozda", "Harper Lee", 1960),
        Book("Idź, postaw wartownika", "Harper Lee", 1960),
        Book("Duma i uprzedzenie", "Jane Austen", 1813),
        Book("Rozważna i romantyczna", "Jane Austen", 1811),
        Book("Moby Dick", "Herman Melville", 1851),
        Book("Człowiek pewny siebie", "Herman Melville", 1857),
        Book("Wojna i pokój", "Lew Tołstoj", 1869),
        Book("Anna Karenina", "Lew Tołstoj", 1877),
        Book("Buszujący w zbożu", "J.D. Salinger", 1951),
        Book("Franny i Zooey", "J.D. Salinger", 1961),
        Book("Hobbit", "J.R.R. Tolkien", 1937),
        Book("Władca Pierścieni", "J.R.R. Tolkien", 1954),
        Book("Zbrodnia i kara", "Fiodor Dostojewski", 1866),
        Book("Bracia Karamazow", "Fiodor Dostojewski", 1880),
        Book("Przygody Sherlocka Holmesa", "Arthur Conan Doyle", 1892),
        Book("Wspomnienia Sherlocka Holmesa", "Arthur Conan Doyle", 1892)
    )

    fun addBook()
    {
        println("Podaj tytuł: ")
        val title=readln()
        println("Podaj autora: ")
        val author=readln()
        println("Podaj rok wydania: ")
        val year=readln().toInt()
        books.add(Book(title,author,year))
        println("Udało się dodać książkę. ")
    }

    fun removeBook()
    {
        println("Podaj tytuł książki, którą chcesz usunąć: ")
        var b = readln()
        var remove = books.find{it.title.equals(b, ignoreCase = true)}
        if (remove!=null)
        {
            books.remove(remove)
            println("Książka $remove została usunięta. ")
        }
        else
        {
            println("Nie znaleziono książki o tytule $remove")
        }
    }

    fun filterByAuthor() {
        println("Podaj autora: ")
        var a = readln()
        var filtered = books.filter { it.author == a }
        println("O to książki autora $a: ")
        filtered.forEach { println(it) }

    }

    fun filterByYear()
    {
        println("Podaj rok: ")
        var y = readln().toInt()
        var filtered = books.filter{ it.year == y }
        println("Oto książki z roku $y: ")
        filtered.forEach{println(it)}
    }

    fun sortedByTitle()
    {
        var sorted = books.sortedBy{it.title}
        println("Oto twoje książki posortowane alfabetycznie po tytule: ")
        sorted.forEach{println(it)}
    }

    fun showBooks()
    {
        println("To twoje ulubione książki: ")
        books.forEach{println(it)}
    }
}

fun main()
{
    while (true)
    {
        println("Wybierz opcję: 1 - Dodaj ksiązkę")
    }
}