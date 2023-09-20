package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Variables
    private var firstNumber = ""
    private var result = ""
    private var operation = ""
    private var decimal = false
    private var response = false

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



        //Buttons click
        button0.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 0
            }else{
                result += 0.0
            }
            textResult.text = result
        }

        button1.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 1
            }else{
                result += 0.1
            }
            textResult.text = result
        }

        button2.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 2
            }else{
                result += 0.2
            }
            textResult.text = result
        }

        button3.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 3
            }else{
                result += 0.3
            }
            textResult.text = result
        }

        button4.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 4
            }else{
                result += 0.4
            }
            textResult.text = result
        }

        button5.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 5
            }else{
                result += 0.5
            }
            textResult.text = result
        }

        button6.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 6
            }else{
                result += 0.6
            }
            textResult.text = result
        }

        button7.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 7
            }else{
                result += 0.7
            }
            textResult.text = result
        }

        button8.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 8
            }else{
                result += 0.8
            }
            textResult.text = result
        }

        button9.setOnClickListener {
            if(response){
                allTo0()
            }
            if(!decimal){
                result += 9
            }else{
                result += 0.9
            }
            textResult.text = result
        }

        buttonAdd.setOnClickListener {
            if(response){
                allTo0()
            }
            firstNumber = result
            result = ""
            operation = "+"
            decimal = false
        }

        buttonMinus.setOnClickListener {
            if(response){
                allTo0()
            }
            firstNumber = result
            result = ""
            operation = "-"
            decimal = false
        }

        buttonMultiply.setOnClickListener {
            if(response){
                allTo0()
            }
            firstNumber = result
            result = ""
            operation = "*"
            decimal = false
        }

        buttonSplit.setOnClickListener {
            if(response){
                allTo0()
            }
            firstNumber = result
            result = ""
            operation = "/"
            decimal = false
        }

        buttonDecimal.setOnClickListener {
            if(response){
                allTo0()
            }
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
            if(response){
                allTo0()
            }
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
            response = true
        }

        savedInstanceState?.let {
            firstNumber = it.getString("firstNumber", "")
            result = it.getString("result", "")
            operation = it.getString("operation", "")
            decimal = it.getBoolean("decimal", false)
            response = it.getBoolean("decimal", false)
            textResult.text = result
        }
    }
    private fun allTo0(){
        response = false
        firstNumber = ""
        result = ""
        operation = ""
        decimal = false
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("firstNumber", firstNumber)
        outState.putString("result", result)
        outState.putString("operation", operation)
        outState.putBoolean("decimal", decimal)
        outState.putBoolean("response", response)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        firstNumber = savedInstanceState.getString("firstNumber", firstNumber)
        result = savedInstanceState.getString("result", result)
        operation = savedInstanceState.getString("operation", operation)
        decimal = savedInstanceState.getBoolean("decimal", decimal)
        response = savedInstanceState.getBoolean("response", response)
    }

    override fun onResume() {
        super.onResume()
        val text:TextView = findViewById(R.id.textResult)
        text.text = result
    }

}