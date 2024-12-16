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


}