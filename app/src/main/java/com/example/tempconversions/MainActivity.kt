package com.example.tempconversions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    private lateinit var FahrenhietWidget: EditText
    private lateinit var CelsiusWidget: EditText
    private lateinit var ResultWidget: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FahrenhietWidget = findViewById(R.id.FahrenhietText)
        CelsiusWidget = findViewById(R.id.CelsiusText)
        ResultWidget = findViewById(R.id.Result)

        FahrenhietWidget.doAfterTextChanged { FarBar() }
        
        CelsiusWidget.doAfterTextChanged { CelBell() }
    }
    fun FarBar(){
        val F = FahrenhietWidget.text.toString().toDoubleOrNull()



        if (F == null ) {
            return
        }
        var C = (F * 9/5) + 32


        val message ="Result is"
        val displayMessage = "$message $C"


        ResultWidget.text = displayMessage


    }


    fun CelBell(){
        val Celsius = CelsiusWidget.text.toString().toDoubleOrNull()

        var Fahrenheit = (Celsius!! -35) * 9/5

        val message ="Result is"
        val displayMessage = "$message $Fahrenheit"

        ResultWidget.text = displayMessage
    }
}


   



