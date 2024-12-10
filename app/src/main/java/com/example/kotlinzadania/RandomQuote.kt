package com.example.kotlinzadania

import kotlin.random.Random

object Quotes
{
    val quotes = mutableListOf(
        "The best way to predict the future is to invent it.",
        "Success is not final, failure is not fatal: It is the courage to continue that counts.",
        "Do what you can, with what you have, where you are.",
        "In the middle of every difficulty lies opportunity.",
        "Don't watch the clock; do what it does. Keep going.",
        "The only way to do great work is to love what you do.",
        "Life is 10% what happens to us and 90% how we react to it.",
        "An unexamined life is not worth living.",
        "Happiness is not something ready-made. It comes from your own actions.",
    )


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
    Quotes.addQuote()
    Quotes.getRandomQuote()
}