package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private var currentNumber = ""
    private var previousNumber = ""
    private var currentOperator = ""
    private var isNewOp = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResult = findViewById(R.id.tvResult)
    }

    fun onDigitClick(view: View) {
        if (isNewOp) {
            tvResult.text = ""
            isNewOp = false
        }
        val button = view as Button
        var newText = tvResult.text.toString() + button.text.toString()
        tvResult.text = newText
        currentNumber = newText
    }

    fun onOperatorClick(view: View) {
        val button = view as Button
        if (currentNumber.isNotEmpty()) {
            previousNumber = currentNumber
        }
        currentOperator = button.text.toString()
        isNewOp = true
    }

    fun onEqualClick(view: View) {
        if (previousNumber.isNotEmpty() && currentNumber.isNotEmpty()) {
            var result = 0.0
            val first = previousNumber.toDouble()
            val second = currentNumber.toDouble()

            when (currentOperator) {
                "+" -> result = first + second
                "-" -> result = first - second
                "*" -> result = first * second
                "/" -> result = first / second
                "%" -> result = first % second
            }
            tvResult.text = result.toString()
            isNewOp = true
            previousNumber = "" // Reset
        }
    }

    fun onClearClick(view: View) {
        tvResult.text = "0"
        isNewOp = true
        currentNumber = ""
        previousNumber = ""
        currentOperator = ""
    }

    fun onDeleteClick(view: View) {
        val str = tvResult.text.toString()
        if (str.isNotEmpty()) {
            tvResult.text = str.substring(0, str.length - 1)
            currentNumber = tvResult.text.toString()
        }
    }
}
