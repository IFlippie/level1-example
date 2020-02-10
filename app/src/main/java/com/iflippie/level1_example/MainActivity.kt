package com.iflippie.level1_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        answer.setOnClickListener()
        {
            checkAnswer()
        }
    }
    fun checkAnswer()
    {
    val theAnswer = if(antwoordtekst.text.toString() == getString(R.string.launcher))
    {
        R.string.correct
    }else
    {
        R.string.incorrect
    }
        Toast.makeText(this, getString(theAnswer), Toast.LENGTH_LONG).show()
    }
}
