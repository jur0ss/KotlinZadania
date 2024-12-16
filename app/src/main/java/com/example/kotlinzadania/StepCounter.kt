package com.example.kotlinzadania

class StepCounter
{
    companion object
    {
        var steps = 0
    }

    fun addStep()
    {
        steps++
    }

    fun resetSteps()
    {
        steps = 0
    }

    fun showSteps()
    {
        println(steps)
    }

}

fun main()
{
    var Krokomierz = StepCounter()
    var i = 0
    while (i<=5000)
    {
        Krokomierz.addStep()
        i++
    }

}