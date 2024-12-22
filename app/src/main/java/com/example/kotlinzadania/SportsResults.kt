package com.example.kotlinzadania

data class Results(val points: Int)

object ResultsAnalyzer
{
    val results = mutableListOf(
        Results(15)
    )
}