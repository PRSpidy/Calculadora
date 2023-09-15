package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buttons
        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        val buttonMultiply: Button = findViewById(R.id.buttonMultiply)
        val buttonSplit: Button = findViewById(R.id.buttonSplit)
        val buttonDecimal: Button = findViewById(R.id.buttonDecimal)
        val buttonEquals: Button = findViewById(R.id.buttonEquals)
        val buttonAC: Button = findViewById(R.id.buttonAc)

        //Text results
        val textResult: TextView = findViewById(R.id.textResult)

        //Variables
        var firstNumber = ""
        var result = ""
        var operation = ""
        var decimal = false

        //Buttons click
        button0.setOnClickListener {
            if(!decimal){
                result += 0
            }else{
                result += 0.0
            }
            textResult.text = result
        }

        button1.setOnClickListener {
            if(!decimal){
                result += 1
            }else{
                result += 0.1
            }
            textResult.text = result
        }

        button2.setOnClickListener {
            if(!decimal){
                result += 2
            }else{
                result += 0.2
            }
            textResult.text = result
        }

        button3.setOnClickListener {
            if(!decimal){
                result += 3
            }else{
                result += 0.3
            }
            textResult.text = result
        }

        button4.setOnClickListener {
            if(!decimal){
                result += 4
            }else{
                result += 0.4
            }
            textResult.text = result
        }

        button5.setOnClickListener {
            if(!decimal){
                result += 5
            }else{
                result += 0.5
            }
            textResult.text = result
        }

        button6.setOnClickListener {
            if(!decimal){
                result += 6
            }else{
                result += 0.6
            }
            textResult.text = result
        }

        button7.setOnClickListener {
            if(!decimal){
                result += 7
            }else{
                result += 0.7
            }
            textResult.text = result
        }

        button8.setOnClickListener {
            if(!decimal){
                result += 8
            }else{
                result += 0.8
            }
            textResult.text = result
        }

        button9.setOnClickListener {
            if(!decimal){
                result += 9
            }else{
                result += 0.9
            }
            textResult.text = result
        }

        buttonAdd.setOnClickListener {
            firstNumber = result
            result = ""
            operation = "+"
            decimal = false
        }

        buttonMinus.setOnClickListener {
            firstNumber = result
            result = ""
            operation = "-"
            decimal = false
        }

        buttonMultiply.setOnClickListener {
            firstNumber = result
            result = ""
            operation = "*"
            decimal = false
        }

        buttonSplit.setOnClickListener {
            firstNumber = result
            result = ""
            operation = "/"
            decimal = false
        }

        buttonDecimal.setOnClickListener {
            decimal = true
        }

        buttonAC.setOnClickListener {
            firstNumber = ""
            result = ""
            operation = ""
            decimal = false
            textResult.text = "0"
        }

        buttonEquals.setOnClickListener {

            when (operation) {
                "+" -> {
                    result = ((firstNumber).toDouble() + (result).toDouble()).toString()
                }
                "-" -> {
                    result = ((firstNumber).toDouble() - (result).toDouble()).toString()
                }
                "*" -> {
                    result = ((firstNumber).toDouble() * (result).toDouble()).toString()
                }
                "/" -> {
                    result = ((firstNumber).toDouble() / (result).toDouble()).toString()
                }
            }
            textResult.text = result
            firstNumber = ""
            result = ""
            operation = ""
        }
    }
}