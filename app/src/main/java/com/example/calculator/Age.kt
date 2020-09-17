package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.time.Year
import java.util.*

class Age : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)
        val year = Calendar.getInstance().get(Calendar.YEAR)
    }
}