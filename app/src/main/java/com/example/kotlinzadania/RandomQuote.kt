package com.example.kotlinzadania

import kotlin.random.Random

object Quotes
{
    val quotes = mutableListOf<String>()

    fun addQuote()
    {
        println("Podaj cytat: ")
        quotes.add(readln())
    }

}