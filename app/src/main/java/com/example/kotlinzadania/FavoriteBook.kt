package com.example.kotlinzadania

import com.example.kotlinzadania.BookManager.books

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

    fun filterByAuthor() {
        println("Podaj autora: ")
        var a = readln()
        var filtered = books.filter { it.author == a }
        filtered.forEach { println(it) }

    }

    fun filterByYear()
    {
        println("Podaj rok: ")
        var y = readln().toInt()
        var filtered = books.filter{ it.year == y }
        filtered.forEach{println(it)}
    }

    fun showBooks()
    {
        books.forEach{println(it)}
    }



}