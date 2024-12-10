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
    }


}