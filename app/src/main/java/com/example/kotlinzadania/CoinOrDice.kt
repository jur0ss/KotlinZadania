package com.example.kotlinzadania

import kotlin.random.Random

interface RollingTool
{
    fun roll()
}

class Coin: RollingTool
{
    override fun roll()
    {
        var roll = Random.nextInt(1,3)
        when(roll)
        {
            1->println("Heads")
            2->println("Tails")
        }
    }
}


class Dice: RollingTool
{
    override fun roll()
    {
        var roll = Random.nextInt(1,7)
        println(roll)
    }
}

fun main()
{
    var dice = Dice()
    dice.roll()

    var coin = Coin()
    coin.roll()
}

