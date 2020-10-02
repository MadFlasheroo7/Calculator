package com.example.calculator

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_data.*
import kotlinx.android.synthetic.main.activity_time.*
import java.lang.Exception
import kotlin.time.*

class Time : AppCompatActivity() {

    @ExperimentalTime
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)


        timeSpin1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                spinnerItem()
                spinnerItem2()
                edText1.requestFocus()
                edText1.setText("")
                edText2.setText("")
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        timeSpin2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                spinnerItem()
                spinnerItem2()
                edText1.setText("")
                edText2.setText("")
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            edText1.showSoftInputOnFocus = false
            edText2.showSoftInputOnFocus = false
        } else { // API 11-20
            edText1.setTextIsSelectable(true)
            edText2.setTextIsSelectable(true)
        }

        Up.setOnClickListener {
            edText1.requestFocus()
            edText2.clearFocus()
        }
        Down.setOnClickListener {
            edText1.clearFocus()
            edText2.requestFocus()
        }

        button1.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("1")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("1")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button2.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("2")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("2")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button3.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("3")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("3")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button4.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("4")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("4")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button5.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("5")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("5")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button6.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("6")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("6")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button7.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("7")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("7")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button8.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("8")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("8")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button9.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("9")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("9")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        button0.setOnClickListener {
            if (edText1.hasFocus()){
                ed1("0")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }else{
                ed2("0")
                onSame()
                updateMMtoSS()
                updateSStoHH()
                updateHHtoMM()
                updateHHtoDD()
                updateMSStoSS()
                updateHHtoMSS()
                updateSStoDD()
                updateMMtoMMS()
                updateMMtoDD()
                updateDDtoMSS()
            }
        }
        btnClearAll.setOnClickListener {
            edText1.setText("")
            edText2.setText("")
        }
    }

    @ExperimentalTime
    private fun updateMMtoSS(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.MM) && spinnerItem2 == getString(R.string.SS)){
                    val str1 = edText1.text.toString().toInt()
                    val convertion = str1.minutes.inSeconds.toFloat()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.SS) && spinnerItem2 == getString(R.string.MM)){
                    val str1 = edText1.text.toString().toInt()
                    val convertion = str1.seconds.inMinutes.toFloat()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.MM) && spinnerItem1 == getString(R.string.SS)){
                    val str1 = edText2.text.toString().toInt()
                    val convertion = str1.minutes.inSeconds.toFloat()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.SS) && spinnerItem1 == getString(R.string.MM)){
                    val str1 = edText2.text.toString().toInt()
                    val convertion = str1.seconds.inMinutes.toFloat()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateSStoHH(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.SS) && spinnerItem2 == getString(R.string.HH)){
                    val str1 = edText1.text.toString().toInt()
                    val convertion = str1.seconds.inHours.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.HH) && spinnerItem2 == getString(R.string.SS)){
                    val str1 = edText1.text.toString().toInt()
                    val convertion = str1.hours.inSeconds.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.SS) && spinnerItem1 == getString(R.string.HH)){
                    val str1 = edText2.text.toString().toInt()
                    val convertion = str1.seconds.inHours.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.HH) && spinnerItem1 == getString(R.string.SS)){
                    val str1 = edText2.text.toString().toInt()
                    val convertion = str1.hours.inSeconds.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateHHtoMM(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.HH) && spinnerItem2 == getString(R.string.MM)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.hours.inMinutes.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.MM) && spinnerItem2 == getString(R.string.HH)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.minutes.inHours.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.HH) && spinnerItem1 == getString(R.string.MM)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.hours.inMinutes.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.MM) && spinnerItem1 == getString(R.string.HH)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.minutes.inHours.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateHHtoDD(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.HH) && spinnerItem2 == getString(R.string.DD)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.hours.inDays.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.DD) && spinnerItem2 == getString(R.string.HH)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.days.inHours.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.HH) && spinnerItem1 == getString(R.string.DD)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.hours.inDays.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.DD) && spinnerItem1 == getString(R.string.HH)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.days.inHours.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateMSStoSS(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.MSS) && spinnerItem2 == getString(R.string.SS)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.milliseconds.inSeconds.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.SS) && spinnerItem2 == getString(R.string.MSS)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.seconds.inMilliseconds.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.MSS) && spinnerItem1 == getString(R.string.SS)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.milliseconds.inSeconds.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.SS) && spinnerItem1 == getString(R.string.MSS)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.seconds.inMilliseconds.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateHHtoMSS(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.HH) && spinnerItem2 == getString(R.string.MSS)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.hours.inMilliseconds.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.MSS) && spinnerItem2 == getString(R.string.HH)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.milliseconds.inHours.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.HH) && spinnerItem1 == getString(R.string.MSS)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.hours.inMilliseconds.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.MSS) && spinnerItem1 == getString(R.string.HH)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.milliseconds.inHours.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateSStoDD(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.SS) && spinnerItem2 == getString(R.string.DD)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.seconds.inDays.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.DD) && spinnerItem2 == getString(R.string.SS)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.days.inSeconds.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.SS) && spinnerItem1 == getString(R.string.DD)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.seconds.inDays.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.DD) && spinnerItem1 == getString(R.string.SS)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.days.inSeconds.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateMMtoMMS(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.MM) && spinnerItem2 == getString(R.string.MSS)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.minutes.inMilliseconds.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.MSS) && spinnerItem2 == getString(R.string.MM)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.milliseconds.inMinutes.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.MM) && spinnerItem1 == getString(R.string.MSS)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.minutes.inMilliseconds.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.MSS) && spinnerItem1 == getString(R.string.MM)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.milliseconds.inMinutes.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateMMtoDD(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.MM) && spinnerItem2 == getString(R.string.DD)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.minutes.inDays.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.DD) && spinnerItem2 == getString(R.string.MM)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.days.inMinutes.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.MM) && spinnerItem1 == getString(R.string.DD)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.minutes.inDays.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.DD) && spinnerItem1 == getString(R.string.MM)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.days.inMinutes.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    @ExperimentalTime
    private fun updateDDtoMSS(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            try {
                if (spinnerItem1 == getString(R.string.DD) && spinnerItem2 == getString(R.string.MSS)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.days.inMilliseconds.toBigDecimal()
                    edText2.setText("$convertion")
                }
                if (spinnerItem1 == getString(R.string.MSS) && spinnerItem2 == getString(R.string.DD)){
                    val str = edText1.text.toString().toInt()
                    val convertion = str.milliseconds.inDays.toBigDecimal()
                    edText2.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
        if (edText2.hasFocus()){
            try {
                if (spinnerItem2 == getString(R.string.DD) && spinnerItem1 == getString(R.string.MSS)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.days.inMilliseconds.toBigDecimal()
                    edText1.setText("$convertion")
                }
                if (spinnerItem2 == getString(R.string.MSS) && spinnerItem1 == getString(R.string.DD)){
                    val str = edText2.text.toString().toInt()
                    val convertion = str.milliseconds.inDays.toBigDecimal()
                    edText1.setText("$convertion")
                }
            }catch (e:Exception){

            }
        }
    }

    private fun onSame(){
        val spinnerItem1 = timeSpin1.selectedItem.toString()
        val spinnerItem2 = timeSpin2.selectedItem.toString()
        if (edText1.hasFocus()){
            if (spinnerItem1 == getString(R.string.DD) && spinnerItem2 == getString(R.string.DD)){
                val str = edText1.text.toString()
                edText2.setText(str)
            }
            if (spinnerItem1 == getString(R.string.HH) && spinnerItem2 == getString(R.string.HH)){
                val str = edText1.text.toString()
                edText2.setText(str)
            }
            if (spinnerItem1 == getString(R.string.MSS) && spinnerItem2 == getString(R.string.MSS)){
                val str = edText1.text.toString()
                edText2.setText(str)
            }
            if (spinnerItem1 == getString(R.string.MM) && spinnerItem2 == getString(R.string.MM)){
                val str = edText1.text.toString()
                edText2.setText(str)
            }
            if (spinnerItem1 == getString(R.string.SS) && spinnerItem2 == getString(R.string.SS)){
                val str = edText1.text.toString()
                edText2.setText(str)
            }
        }
        if (edText2.hasFocus()){
            if (spinnerItem1 == getString(R.string.DD) && spinnerItem2 == getString(R.string.DD)){
                val str = edText2.text.toString()
                edText1.setText(str)
            }
            if (spinnerItem1 == getString(R.string.HH) && spinnerItem2 == getString(R.string.HH)){
                val str = edText2.text.toString()
                edText1.setText(str)
            }
            if (spinnerItem1 == getString(R.string.MSS) && spinnerItem2 == getString(R.string.MSS)){
                val str = edText2.text.toString()
                edText1.setText(str)
            }
            if (spinnerItem1 == getString(R.string.MM) && spinnerItem2 == getString(R.string.MM)){
                val str = edText2.text.toString()
                edText1.setText(str)
            }
            if (spinnerItem1 == getString(R.string.SS) && spinnerItem2 == getString(R.string.SS)){
                val str = edText2.text.toString()
                edText1.setText(str)
            }
        }
    }

    fun spinnerItem(){
        when(timeSpin1.selectedItem.toString()){
            "Seconds" -> {
                time_format1.setText(R.string.Seconds)
            }
            "Minutes" -> {
                time_format1.setText(R.string.Minutes)
            }
            "MilliSeconds" -> {
                time_format1.setText(R.string.Milliseconds)
            }
            "Hours" -> {
                time_format1.setText(R.string.Hours)
            }
            "Days" -> {
                time_format1.setText(R.string.Days)
            }
        }
    }
    fun spinnerItem2(){
        when(timeSpin2.selectedItem.toString()){
            "Seconds" -> {
                time_format2.setText(R.string.Seconds)
            }
            "Minutes" -> {
                time_format2.setText(R.string.Minutes)
            }
            "MilliSeconds" -> {
                time_format2.setText(R.string.Milliseconds)
            }
            "Hours" -> {
                time_format2.setText(R.string.Hours)
            }
            "Days" -> {
                time_format2.setText(R.string.Days)
            }
        }
    }
    private fun ed1(str: String) {
        val oldStr = edText1.text.toString()
        val cursorPos = edText1.selectionStart
        val leftStr = oldStr.substring(0, cursorPos)
        val rightStr = oldStr.substring(cursorPos)
        edText1.setText(String.format("%s%s%s", leftStr, str, rightStr))
        edText1.setSelection(cursorPos + 1)

    }
    private fun ed2(str: String) {
        val oldStr2 = edText2.text.toString()
        val cursorPos2 = edText2.selectionStart
        val leftStr2 = oldStr2.substring(0, cursorPos2)
        val rightStr2 = oldStr2.substring(cursorPos2)
        edText2.setText(String.format("%s%s%s", leftStr2, str, rightStr2))
        edText2.setSelection(cursorPos2 + 1)
    }
}