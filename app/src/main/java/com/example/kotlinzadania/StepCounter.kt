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

}

fun main()
{

}