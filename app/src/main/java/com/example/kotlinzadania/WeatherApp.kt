package com.example.kotlinzadania

data class City (val name: String)

interface Weather
{
    fun showWeather()
}

class Sunny: Weather
{
    override fun showWeather() {
        println("Jutro będzie słonecznie")
    }
}

class Rainy: Weather
{
    override fun showWeather() {
        println("Jutro będzie deszczowo")
    }
}

class Snowy: Weather
{
    override fun showWeather() {
        println("Jutro będzie padał śnieg")
    }
}

class Cloudy: Weather
{
    override fun showWeather() {
        println("Jutro będzie zachmurzenie")
    }
}

fun main()
{

}