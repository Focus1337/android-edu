package com.example.simplecalculator

enum class Operation {
    Plus,
    Minus,
    Multiply,
    Divide
}

class Calculator {
    fun calculate(arg1: Int, operation: Operation, arg2: Int): String = when (operation) {
        Operation.Plus -> (arg1 + arg2).toString()
        Operation.Minus -> (arg1 - arg2).toString()
        Operation.Multiply -> (arg1 * arg2).toString()
        Operation.Divide -> {
            if (arg2 == 0)
                "Error"
            else
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