package com.example.simplecalculator

import android.content.Context
import android.widget.Toast

enum class Operation {
    Plus,
    Minus,
    Multiply,
    Divide
}

class MathExpression(
    val arg1: Int,
    val operation: Operation,
    val arg2: Int
)

class Calculator(context: Context) {
    private val activity = context

    //    val operators = listOf("+", "-", "*", "/")
//    val operators = mapOf(
//        Operation.Plus to "+",
//        Operation.Minus to "-",
//        Operation.Multiply to "*",
//        Operation.Divide to "/"
//    )

    fun deserialize(expression: String): MathExpression {
        val values = expression.split(" ")
//        return object {
//            val arg1: Int = values[0].toInt()
//            val operation: Operation = getOperator(values[1])
//            val arg2: Int = values[2].toInt()
//        }
        return MathExpression(
            values[0].toInt(), getOperator(values[1]), values[2].toInt()
        )
    }

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

    fun getOperator(operation: Operation): String = when (operation) {
        Operation.Plus -> "+"
        Operation.Minus -> "-"
        Operation.Multiply -> "*"
        Operation.Divide -> "/"
    }

    fun getOperator(operation: String): Operation = when (operation) {
        "+" -> Operation.Plus
        "-" -> Operation.Minus
        "*" -> Operation.Multiply
        "/" -> Operation.Divide
        else -> {
            Operation.Plus
        }
    }

//    fun getOperator(operation: Operation): String? = when (operation) {
//        Operation.Plus -> operators[Operation.Plus]
//        Operation.Minus -> operators[Operation.Minus]
//        Operation.Multiply -> operators[Operation.Multiply]
//        Operation.Divide -> operators[Operation.Divide]
//    }
}