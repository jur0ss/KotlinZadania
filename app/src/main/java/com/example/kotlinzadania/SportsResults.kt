package com.example.kotlinzadania

data class Results(val points: Int)

object ResultsAnalyzer
{
    val results = mutableListOf(
        Results(15),
        Results(12),
        Results(19),
        Results(25),
        Results(30),
        Results(8),
        Results(22),
        Results(17),
        Results(27),
        Results(14)
    )

    fun filterResults()
    {
        println("Podaj minimalny próg punktów zdobytych przez drużynę: ")
        val min = readln().toInt()
        val filtered = results.filter { it.points > min }
        println("Wyniki powyżej $min punktów: ")
        filtered.forEach{ println("${it.points}") }
    }

}

fun main()
{
    ResultsAnalyzer.filterResults()
}