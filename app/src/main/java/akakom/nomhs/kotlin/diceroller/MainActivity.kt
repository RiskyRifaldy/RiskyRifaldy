package akakom.nomhs.kotlin.diceroller

import akakom.nomhs.kotlin.diceroller.R.id.button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * Code Dibawah Ini Untuk Fungsi tombol Dadu
         */
        val rollButton: Button = findViewById(button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Code Dibawah Ini Agar Dadu Keluar Random
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    /**
     * Dibawah Ini Adalah Kelas Untuk Dadu Agar Bisa Di ROLL
     */
    class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}