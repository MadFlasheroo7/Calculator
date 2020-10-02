package com.example.calculator

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_age.*
import kotlinx.android.synthetic.main.activity_age.btndelete
import kotlinx.android.synthetic.main.activity_data.*
import java.time.Year
import java.util.*

class Age : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            ageText.showSoftInputOnFocus = false
        } else { // API 11-20
            ageText.setTextIsSelectable(true)
        }
        one.setOnClickListener {
            ageText.append("1")
        }
        two.setOnClickListener {
            ageText.append("2")
        }
        three.setOnClickListener {
            ageText.append("3")
        }
        four.setOnClickListener {
            ageText.append("4")
        }
        five.setOnClickListener {
            ageText.append("5")
        }
        six.setOnClickListener {
            ageText.append("6")
        }
        seven.setOnClickListener {
            ageText.append("7")
        }
        eight.setOnClickListener {
            ageText.append("8")
        }
        nine.setOnClickListener {
            ageText.append("9")
        }
        zero.setOnClickListener {
            ageText.append("0")
//            calcAge()
        }
        btndelete.setOnClickListener {
            val cursorPos = ageText.selectionStart
            val len = ageText.text?.length
            if (cursorPos != 0 && len !=0){
                val spannableStringBuilder : SpannableStringBuilder = ageText.text as SpannableStringBuilder
                spannableStringBuilder.replace(cursorPos - 1, cursorPos, "")
                ageText.text = spannableStringBuilder
            }
            val result = ageText.text.toString()
            ageText.setSelection(result.length)
        }
        btndelete.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {
                ageText.setText("")
                userAge.text = ""
                return true
            }
        })
        equalTO.setOnClickListener {
            try {
                val currentYear = Calendar.getInstance().get(Calendar.YEAR)
                val birthYear = ageText.text.toString().toInt()
                if (birthYear < currentYear){
                    val age = currentYear - birthYear
                    userAge.text = "$age"
                    if (birthYear <= 1600){
                        val age = currentYear - birthYear
                        userAge.text = "$age"
                        Toast.makeText(applicationContext,"Am Glad You Still Alive :-)",Toast.LENGTH_LONG).show()
                    }
                }
                else{
                    ageText.setText("")
                    userAge.text = ""
                    Toast.makeText(applicationContext,"Invalid Year",Toast.LENGTH_LONG).show()
                }
            }catch (e:Exception){

            }
        }
    }
}