package com.example.simplecalculator

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Group

class MainActivity : AppCompatActivity() {
    private lateinit var operationTextView: TextView
    private lateinit var resultTextView: TextView

    private fun Group.setAllOnClickListener(listener: View.OnClickListener?) {
        referencedIds.forEach { id ->
            rootView.findViewById<View>(id).setOnClickListener(listener)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculator = Calculator(this@MainActivity)

        operationTextView = findViewById(R.id.operationTextView)
        resultTextView = findViewById(R.id.resultTextView)

        val equalButton: Button = findViewById(R.id.equalButton)

        equalButton.setOnClickListener {
            val mathExpression = calculator.deserialize(operationTextView.text.toString())
            resultTextView.text = calculator.calculate(
                mathExpression.arg1,
                mathExpression.operation,
                mathExpression.arg2
            )
        }

//        val buttonGroup: Group = findViewById(R.id.buttonGroup)
//
//        var prevButton: Button = findViewById(R.id.equalButton)
//        var arg1: String
//        val arg2: String
//        val operators = calculator.operators.values.toList()
//        val numbers = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
//
//        buttonGroup.setAllOnClickListener {
//            if ((it as Button).text in numbers) {
//
//            }
//
//            if ((it as Button).text in operators) {
//                if (prevButton.text !in numbers) {
//                    Log.i("XDDD", "PREV OPERATOR ISN'T VAR")
////                    return@setAllOnClickListener
//                } else {
//                    arg1 = prevButton.text.toString()
//                    prevButton = it
//                }
//            }
//
//        }


//        Log.i("XDDD", it.toString())
//
//        val plusButton: Button = findViewById(R.id.plusButton)
//
//        val arg1 = 12
//        val arg2 = 12

//        plusButton.setOnClickListener {
//            operationTextView.text = "$arg1 ${calculator.getOperationSign(Operation.Plus)} $arg2"
//            resultTextView.text = calculator.calculate(arg1, Operation.Plus, arg2)
//        }
    }
}