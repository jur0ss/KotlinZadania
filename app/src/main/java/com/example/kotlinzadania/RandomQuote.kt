package com.example.kotlinzadania

import kotlin.random.Random

object Quotes
{
    val quotes = mutableListOf<String>("elo","siema","cześć")

    fun addQuote()
    {
        println("Podaj cytat: ")
        quotes.add(readln())
    }

    fun getRandomQuote()
    {
        var rand = Random.nextInt(0,quotes.size)
        println("Wylosowany cytat to: "+quotes[rand])
    }

}

fun main()
{
    Quotes.getRandomQuote()
}