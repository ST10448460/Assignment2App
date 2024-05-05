package com.example.assignment2remake

import android.content.Intent
import android.icu.util.DateInterval
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {

    private lateinit var petImageView: ImageView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanTextView: TextView
    private lateinit var happyTextView: TextView
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button

    private var pet: Pet? = null
    private  var timer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        petImageView = findViewById(R.id.petImageView)
        hungerTextView = findViewById(R.id.hungerTextView)
        cleanTextView = findViewById(R.id.cleanTextView)
        happyTextView = findViewById(R.id.happyTextView)
        feedButton = findViewById(R.id.feedButton)
        cleanButton = findViewById(R.id.cleanButton)
        playButton = findViewById(R.id.playButton)


        pet = Pet()

        feedButton.setOnClickListener{
            feedPet()
        }
        cleanButton.setOnClickListener{
            cleanPet()
        }
        playButton.setOnClickListener{
            playWithPet()
        }
        updateUI()

    }
    private fun feedPet(){
        petImageView.setImageResource(R.drawable.img)
        pet?.feed()
        updateUI()
    }
    private fun cleanPet(){
        petImageView.setImageResource(R.drawable.img_1)
        pet?.clean()
        updateUI()
    }
    private fun playWithPet(){
        petImageView.setImageResource(R.drawable.img_2)
        pet?.play()
        updateUI()
    }
    private fun updateUI(){
        hungerTextView.text = "Hunger: ${pet?.hunger}"
        cleanTextView.text = "Cleanliness: ${pet?.cleanliness}"
        happyTextView.text = "Happy: ${pet?.happy}"
    }
}