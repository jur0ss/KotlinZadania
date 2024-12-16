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
    while (i<=4999)
    {
        i++
        Krokomierz.addStep()
    }
    while (true)
    {
        println("Co chcesz wykonać: 1 - pokaż kroki | 2 - zresetuj kroki | 3 - zakończ")
        var choice = readln().toInt()
        if(choice==1)
        {
            Krokomierz.showSteps()
        }
        else if (choice==2)
        {
            println("Czy na pewno chcesz zresetować swoje kroki?: ")
            var sure = readln()
            if (sure=="tak")
            {
                println("Zresetowano kroki")
                Krokomierz.resetSteps()
            }
            else
            {
                println("Nie zresetowano kroków")
            }
        }
        else if (choice==3)
        {
            break
        }
    }
}