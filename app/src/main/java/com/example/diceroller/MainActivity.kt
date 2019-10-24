package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result_text.text = "Dice Rolled!"

        roll_button.setOnClickListener { rollDice() }
        reset_button.setOnClickListener{ resetDice() }

    }

    private fun rollDice(){

        val randomInt = Random().nextInt(6) + 1
        result_text.text = randomInt.toString()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        //
    }

    private fun resetDice(){

        result_text.text = "0"
        Toast.makeText(this, "number reset",
            Toast.LENGTH_SHORT).show()
        //
    }
}
