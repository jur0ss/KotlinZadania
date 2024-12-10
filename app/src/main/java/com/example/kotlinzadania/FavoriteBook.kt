package com.example.kotlinzadania

data class Book(val title: String, val author: String, val year: Int)

object BookManager
{
    val books = mutableListOf<Book>()

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

    fun filterBy()
    {
        println("Po czym chcesz sortować swoje książki: a - autor | y - rok wydania")
        var choice = readln()
        if (choice=="a")
        {
            println("Podaj autora: ")
            var a = readln()
            var filtered = books.filter{it.author.equals(a)}
            filtered.forEach{println(it)}
        }
        else if (choice=="y")
        {
            println("Podaj rok: ")
            var y = readln().toInt()
            var filtered = books.filter{it.year.equals(y)}
            filtered.forEach{println(it)}
        }
    }


}