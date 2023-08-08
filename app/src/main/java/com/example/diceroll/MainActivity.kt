package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.rollbutton)
        rollButton.setOnClickListener {
            rolldevice()

        }
    }
     fun rolldevice() {

         val randomInt = Random.nextInt(6) + 1
         val drawdice: ImageView = findViewById(R.id.imageView)
         val drawableresources = when (randomInt) {

             1 -> R.drawable.dice_1
             2 -> R.drawable.dice_2
             3 -> R.drawable.dice_3
             4 -> R.drawable.dice_4
             5 -> R.drawable.dice_5

             else -> R.drawable.dice_6
         }

         drawdice.setImageResource(drawableresources)

     }

    }
