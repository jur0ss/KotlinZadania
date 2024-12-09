package com.example.kotlinzadania

import kotlin.random.Random

interface RollingTool
{
    fun roll()
    {
        var roll = Random.nextInt(1,6)
    }
}
