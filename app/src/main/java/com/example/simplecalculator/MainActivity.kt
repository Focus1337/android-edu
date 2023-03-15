package com.example.simplecalculator

import android.os.Bundle
import android.util.Log
import android.view.View
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

//        val variableGroup: Group = findViewById(R.id.variableGroup)
//        val operationGroup: Group = findViewById(R.id.operationGroup)

        val buttonGroup: Group = findViewById(R.id.buttonGroup)

//        for (yes in operationGroup.referencedIds) {
//            val govno: Button = findViewById(yes)
//            Log.i("xd", govno.text.toString())
//        }


        buttonGroup.setAllOnClickListener {
            Log.i("XDDD", it.toString())
        }


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