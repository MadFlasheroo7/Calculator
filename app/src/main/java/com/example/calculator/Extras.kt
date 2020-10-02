package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_extras.*
import kotlinx.android.synthetic.main.activity_extras_content.*

class Extras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extras)
        standard.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        })
        programmer.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Programmer::class.java)
            startActivity(intent)
        })
        currency.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Currency::class.java)
            startActivity(intent)
        })
        mass.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Mass::class.java)
            startActivity(intent)
        })
        data.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Data::class.java)
            startActivity(intent)
        })
        time.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Time::class.java)
            startActivity(intent)
        })
        age.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,Age::class.java)
            startActivity(intent)
        })
        temprature.setOnClickListener {
            val intent = Intent(this,Temperature::class.java)
            startActivity(intent)
        }
//        about.setOnClickListener(View.OnClickListener {
//            val intent = Intent(this,About::class.java)
//            startActivity(intent)
//        })
    }
}