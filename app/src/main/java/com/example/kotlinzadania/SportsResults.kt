package com.example.kotlinzadania

data class Results(val points: Int, val opponent: String, val oppPoints: Int)

object ResultsAnalyzer
{
    val results = mutableListOf(
        Results(15, "Tigers", 12),
        Results(12, "Lions", 18),
        Results(19, "Bears", 20),
        Results(25, "Wolves", 15),
        Results(30, "Eagles", 22),
        Results(8, "Sharks", 30),
        Results(22, "Panthers", 25),
        Results(17, "Falcons", 14),
        Results(27, "Hawks", 19),
        Results(14, "Cobras", 17)
    )

    fun filterResults()
    {
        println("Podaj minimalny próg punktów zdobytych przez drużynę: ")
        val min = readln().toInt()
        val filtered = results.filter { it.points > min }
        println("Wyniki powyżej $min punktów: ")
        filtered.forEach{ println("vs ${it.opponent}: ${it.points} - ${it.oppPoints}") }
    }

}

fun main()
{
    ResultsAnalyzer.filterResults()
}