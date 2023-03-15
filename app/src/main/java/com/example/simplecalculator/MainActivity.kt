package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var helloTextView: TextView
    private lateinit var resultTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculator = Calculator()

        helloTextView = findViewById(R.id.operationTextView)
        resultTextView = findViewById(R.id.resultTextView)

        val plusButton: Button = findViewById(R.id.plusButton)

        val arg1 = 12
        val arg2 = 4

        plusButton.setOnClickListener {
            helloTextView.text = "$arg1 ${calculator.getOperationSign(Operation.Plus)} $arg2"
            resultTextView.text = calculator.calculate(arg1, Operation.Plus, arg2)
        }
    }



}