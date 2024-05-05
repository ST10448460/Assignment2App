package com.example.assignment2remake

import java.util.Timer
import java.util.TimerTask
import kotlin.concurrent.timer

class Pet{
    var hunger: Int = 75
    var happy: Int = 100
    var cleanliness: Int = 75

    fun feed() {
        hunger += 20
        cleanliness -= 20
    }

    fun clean(){
        cleanliness += 20
        happy += 5
    }

    fun play(){
        hunger -= 10
        happy += 10
    }

}