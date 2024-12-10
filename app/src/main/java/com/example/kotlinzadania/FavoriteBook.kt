package com.example.kotlinzadania

data class Book(val title: String, val author: String, val year: Int)

object BookManager
{
    val books = mutableListOf<Book>()


}