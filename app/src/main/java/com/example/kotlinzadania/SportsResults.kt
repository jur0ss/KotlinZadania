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
}