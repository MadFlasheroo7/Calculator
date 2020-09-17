package com.example.calculator

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateText(str = String())

        calcScreen.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString()){
                calcScreen.setText("")
            }
        })
        extras.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Extras ::class.java)
            startActivity(intent)
        })
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            calcScreen.showSoftInputOnFocus = false
        } else { // API 11-20
            calcScreen.setTextIsSelectable(true)
        }
        num0.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
            calcScreen.setText("")
            }
            updateText("0")
        })
        num1.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("1")
        })
        num2.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("2")
        })
        num3.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("3")
        })
        num4.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("4")
        })
        num5.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("5")
        })
        num6.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("6")
        })
        num7.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("7")
        })
        num8.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("8")
        })
        num9.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText("9")
        })
        dot.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            updateText(".")
        })
        /*
            operators
         */
        addition.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            calcScreen.append(" + ")
        })
        subtraction.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            calcScreen.append(" - ")
        })
        multiplication.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            calcScreen.append(" * ")
        })
        division.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            calcScreen.append(" / ")
        })
        percentage.setOnClickListener(View.OnClickListener {
            if (getString(R.string.display) == calcScreen.text.toString())
            {
                calcScreen.setText("")
            }
            calcScreen.append(" % ")
        })
        /*
        ClearAll and delete btn logic
         */
        delete.setOnClickListener(View.OnClickListener {
            val cursorPos = calcScreen.selectionStart
            val len = calcScreen.text.length
            if (cursorPos != 0 && len !=0){
                val spannableStringBuilder : SpannableStringBuilder = calcScreen.text as SpannableStringBuilder
                spannableStringBuilder.replace(cursorPos - 1,cursorPos,"")
                calcScreen.text = spannableStringBuilder
//                calcScreen.setSelection(cursorPos - 1)
            }
            val result = calcScreen.text.toString()
            calcScreen.setSelection(result.length)
        })
        clearAll.setOnClickListener(View.OnClickListener {
            calcScreen.setText("")
        })

        equals.setOnClickListener(View.OnClickListener {
            try {
                val input = ExpressionBuilder(calcScreen.text.toString()).build()
                val output = input.evaluate()
                val longOutput = output.toLong()
                if (output == longOutput.toDouble()){
                    calcScreen.setText(String.format(longOutput.toBigDecimal().toString()))
                }else{
                    calcScreen.setText(String.format(output.toBigDecimal().toString()))
                }
            }catch (e:Exception){
                Toast.makeText(this,"Syntax Error",Toast.LENGTH_SHORT).show()
            }
            val result = calcScreen.text.toString()
            calcScreen.setSelection(result.length)
        })
    }
    private fun updateText(str:String) {
        val oldStr = calcScreen.text.toString()
        val cursorPos = calcScreen.selectionStart
        val leftStr = oldStr.substring(0, cursorPos)
        val rightStr = oldStr.substring(cursorPos)
        calcScreen.setText(String.format("%s%s%s", leftStr, str, rightStr))
        calcScreen.setSelection(cursorPos + 1)
    }

}



