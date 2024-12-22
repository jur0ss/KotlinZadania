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
        Results(14, "Cobras", 8)
    )

    fun filterResults()
    {
        println("Podaj minimalny próg punktów zdobytych przez drużynę: ")
        val min = readln().toInt()
        val filtered = results.filter { it.points >= min }

        println("Wyniki powyżej $min punktów: ")
        filtered.forEach{ println("vs ${it.opponent}: ${it.points} - ${it.oppPoints}") }
    }

    fun sumResults()
    {
        val totalPoints = results.sumOf { it.points }
        val totalOppPoints = results.sumOf { it.oppPoints }

        println("Suma punktów zdobytych przez drużynę: $totalPoints")
        println("Suma punktów zdobytych przez przeciwników: $totalOppPoints")
    }

    fun maxPoints()
    {
        val maxPoints = results.maxBy { it.points }
        val maxOppPoints = results.maxBy { it.oppPoints }

        println("Drużyna zdobyła najwięcej punktów: ${maxPoints.points} w meczu z ${maxPoints.opponent}")
        println("Drużyna straciła najwięcej punktów: ${maxOppPoints.oppPoints} w meczu z ${maxOppPoints.opponent}")
    }



}

fun main()
{
    ResultsAnalyzer.maxPoints()
}