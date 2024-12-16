package com.example.kotlinzadania

import kotlin.random.Random


data class City (val name: String)

interface Weather
{
    fun showWeather()
}

class Sunny: Weather
{
    override fun showWeather() {
        println("Będzie słonecznie")
    }
}

class Rainy: Weather
{
    override fun showWeather() {
        println("Będzie deszczowo")
    }
}

class Snowy: Weather
{
    override fun showWeather() {
        println("Będzie padał śnieg")
    }
}

class Cloudy: Weather
{
    override fun showWeather() {
        println("Będzie zachmurzenie")
    }
}

fun randomWeather(): Weather
{
    return when(Random.nextInt(1,5))
    {
        1 -> Sunny()
        2 -> Rainy()
        3 -> Snowy()
        4 -> Cloudy()
        else -> Sunny()
    }
}

fun main()
{
    val cities =
        mutableListOf(
            City("Warszawa"),
            City("Kraków"),
            City("Gdańsk"),
            City("Wrocław"),
            City("Poznań"),
            City("Łódź"),
            City("Szczecin"),
            City("Bydgoszcz"),
            City("Lublin"),
            City("Białystok"),
            City("Katowice"),
            City("Gdynia"),
            City("Toruń"),
            City("Opole"),
            City("Rzeszów"),
            City("Zielona Góra"),
            City("Olsztyn"),
            City("Gliwice"),
            City("Częstochowa"),
            City("Radom")
        )

    println("Prognoza pogody na jutro: ")
    var i = 0
    while (i<cities.size)
    {
        var city = cities[i]
        var weather = randomWeather()
        println("${city.name}: ")
        weather.showWeather()
        i++
    }




}