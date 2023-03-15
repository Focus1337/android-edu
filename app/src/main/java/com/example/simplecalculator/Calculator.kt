package com.example.simplecalculator

import android.content.Context
import android.widget.Toast

enum class Operation {
    Plus,
    Minus,
    Multiply,
    Divide
}

class Calculator(context: Context) {
    private val activity = context

    fun calculate(arg1: Int, operation: Operation, arg2: Int): String = when (operation) {
        Operation.Plus -> (arg1 + arg2).toString()
        Operation.Minus -> (arg1 - arg2).toString()
        Operation.Multiply -> (arg1 * arg2).toString()
        Operation.Divide -> {
            if (arg2 == 0) {
                Toast.makeText(activity, "Нельзя делить на 0!", Toast.LENGTH_SHORT).show()
                "Error"
            } else
                (arg1 / arg2).toString()
        }
    }

    fun getOperationSign(operation: Operation): String = when (operation) {
        Operation.Plus -> "+"
        Operation.Minus -> "-"
        Operation.Multiply -> "*"
        Operation.Divide -> "/"
    }
}