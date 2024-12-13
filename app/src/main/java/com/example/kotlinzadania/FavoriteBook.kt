package com.example.kotlinzadania

import com.example.kotlinzadania.BookManager.books

data class Book(val title: String, val author: String, val year: Int)

object BookManager
{
    val books = mutableListOf(
        Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
        Book("Tender is the Night", "F. Scott Fitzgerald", 1934),
        Book("1984", "George Orwell", 1949),
        Book("Animal Farm", "George Orwell", 1945),
        Book("To Kill a Mockingbird", "Harper Lee", 1960),
        Book("Go Set a Watchman", "Harper Lee", 1960),
        Book("Pride and Prejudice", "Jane Austen", 1813),
        Book("Sense and Sensibility", "Jane Austen", 1811),
        Book("Moby-Dick", "Herman Melville", 1851),
        Book("The Confidence-Man", "Herman Melville", 1857),
        Book("War and Peace", "Leo Tolstoy", 1869),
        Book("Anna Karenina", "Leo Tolstoy", 1877),
        Book("The Catcher in the Rye", "J.D. Salinger", 1951),
        Book("Franny and Zooey", "J.D. Salinger", 1961),
        Book("The Hobbit", "J.R.R. Tolkien", 1937),
        Book("The Lord of the Rings", "J.R.R. Tolkien", 1954),
        Book("Crime and Punishment", "Fyodor Dostoevsky", 1866),
        Book("The Brothers Karamazov", "Fyodor Dostoevsky", 1880),
        Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 1892),
        Book("The Memoirs of Sherlock Holmes", "Arthur Conan Doyle", 1892)
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
    BookManager.showBooks()
    BookManager.sortedByTitle()
}