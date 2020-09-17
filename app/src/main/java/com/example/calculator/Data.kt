package com.example.calculator

import android.os.Build
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_data.*
import kotlinx.android.synthetic.main.activity_main.*

class Data : AppCompatActivity() {
    private var str1 = ""
    private var str2 = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        ed1(str = String())
        ed2(str = String())

        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?,view: View?,position: Int,id: Long) {
                spinnerItem()
                editScreen1.setText("")
                editScreen2.setText("")
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?,view: View?,position: Int,id: Long) {
                spinnerItem2()
                editScreen1.setText("")
                editScreen2.setText("")
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
//        editScreen1.setOnClickListener(View.OnClickListener {
//            try {
//                if (getString(R.string.display) == calcScreen.text.toString()) {
//                    calcScreen.setText("")
//                }
//            }catch (e:Exception){
//
//            }
//        })
//        editScreen2.setOnClickListener(View.OnClickListener {
//
//            if (getString(R.string.display) == calcScreen.text.toString()) {
//                calcScreen.setText("")
//            }
//        })

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            editScreen1.showSoftInputOnFocus = false
            editScreen2.showSoftInputOnFocus = false
        } else { // API 11-20
            editScreen1.setTextIsSelectable(true)
            editScreen2.setTextIsSelectable(true)
        }
        /*
        function to move cursor
         */
        arrowUP.setOnClickListener {
            editScreen2.clearFocus()
            editScreen1.requestFocus()
        }
        arrowDOWN.setOnClickListener {
            editScreen1.clearFocus()
            editScreen2.requestFocus()
        }

        btn1.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("1")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("1")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn2.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("2")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("2")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn3.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("3")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("3")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn4.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("4")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("4")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn5.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("5")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("5")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn6.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("6")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("6")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn7.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("7")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("7")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn8.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("8")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("8")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn9.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("9")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("9")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })
        btn0.setOnClickListener(View.OnClickListener {
            if (editScreen1.hasFocus()) {
                ed1("0")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            } else {
                ed2("0")
                updateKBtoMB()
                updateGBtoKB()
                updateMBtoGB()
            }
        })

        btnclearAll.setOnClickListener {
            editScreen1.setText("")
            editScreen2.setText("")
        }
        btndelete.setOnClickListener {
            updateKBtoMB()
            updateGBtoKB()
            updateMBtoGB()
            if (editScreen1.hasFocus())
            {
                val cursorPos = editScreen1.selectionStart
                val len = editScreen1.text.length
                if (cursorPos != 0 && len !=0){
                    val spannableStringBuilder : SpannableStringBuilder = editScreen1.text as SpannableStringBuilder
                    spannableStringBuilder.replace(cursorPos - 1, cursorPos, "")
                    editScreen1.text = spannableStringBuilder
                }
                if (len == 0){
                    editScreen1.setText("")
                    editScreen2.setText("")
                }
                val result = editScreen1.text.toString()
                editScreen1.setSelection(result.length)
            }
            else
            {
                val cursorPos = editScreen2.selectionStart
                val len = editScreen2.text.length
                if (cursorPos != 0 && len !=0){
                    val spannableStringBuilder : SpannableStringBuilder = editScreen2.text as SpannableStringBuilder
                    spannableStringBuilder.replace(cursorPos - 1, cursorPos, "")
                    editScreen2.text = spannableStringBuilder
                }
                if (len == 0){
                    editScreen1.setText("")
                    editScreen2.setText("")
                }
                val result = editScreen2.text.toString()
                editScreen2.setSelection(result.length)
                }
            }
    }
//    private fun auto(){
//        //given num / 1024
//        str1 = editScreen1.text.toString()
//        val value = 1024
//        val result = str1.toFloat() / value
//        val final = result.toBigDecimal()
//        editScreen2.setText("$final")
//    }
    private fun updateKBtoMB(){
        val spinner1Item = spinner1.selectedItem.toString()
        val spinner2Item = spinner2.selectedItem.toString()
        if (editScreen1.hasFocus()){
            try {
                if(spinner1Item == getString(R.string.KB) && spinner2Item == getString(R.string.MB)){
                    str1 = editScreen1.text.toString()
                    val value = 1024
                    val result = str1.toFloat() / value
                    val final = result.toBigDecimal()
                    editScreen2.setText("$final")
                }
                if(spinner1Item == getString(R.string.MB) && spinner2Item == getString(R.string.KB)){
                    str1 = editScreen1.text.toString()
                    val value = 1024
                    val result = str1.toFloat() * value
                    val final = result.toBigDecimal()
                    editScreen2.setText("$final")
                }
            }catch (e:Exception){
                Toast.makeText(this,"you have reached limit",Toast.LENGTH_LONG).show()
            }

        }
        if (editScreen2.hasFocus()){
            try {
                if(spinner1Item == getString(R.string.KB) && spinner2Item == getString(R.string.MB)){
                    str1 = editScreen2.text.toString()
                    val value = 1024
                    val result = str1.toFloat() * value
                    val final = result.toBigDecimal()
                    editScreen1.setText("$final")
                }
                if(spinner1Item == getString(R.string.MB) && spinner2Item == getString(R.string.KB)){
                    str1 = editScreen2.text.toString()
                    val value = 1024
                    val result = str1.toFloat() / value
                    val final = result.toBigDecimal()
                    editScreen1.setText("$final")
                }
            }catch (e:Exception){
                Toast.makeText(this,"you have reached limit",Toast.LENGTH_LONG).show()
            }

        }
    }

    private fun updateMBtoGB(){
        val spinner1Item = spinner1.selectedItem.toString()
        val spinner2Item = spinner2.selectedItem.toString()
        if (editScreen1.hasFocus()){
            try {
                if(spinner1Item == getString(R.string.MB) && spinner2Item == getString(R.string.GB)){
                    str1 = editScreen1.text.toString()
                    val value = 1024
                    val result = str1.toDouble() / value
                    val final = result.toBigDecimal()
                    editScreen2.setText("$final")
                }
                if(spinner1Item == getString(R.string.GB) && spinner2Item == getString(R.string.MB)){
                    str1 = editScreen1.text.toString()
                    val value = 1024
                    val result = str1.toDouble() * value
                    val final = result.toBigDecimal()
                    editScreen2.setText("$final")
                }
            }catch (e:Exception){
                Toast.makeText(this,"you have reached limit",Toast.LENGTH_LONG).show()
            }
        }
        if (editScreen2.hasFocus()){
            try {
                if(spinner1Item == getString(R.string.MB) && spinner2Item == getString(R.string.GB)){
                    str1 = editScreen2.text.toString()
                    val value = 1024
                    val result = str1.toFloat() * value
                    val final = result.toBigDecimal()
                    editScreen1.setText("$final")
                }
                if(spinner1Item == getString(R.string.GB) && spinner2Item == getString(R.string.MB)){
                    str1 = editScreen2.text.toString()
                    val value = 1024
                    val result = str1.toFloat() / value
                    val final = result.toBigDecimal()
                    editScreen1.setText("$final")
                }
            }catch (e:Exception){
                Toast.makeText(this,"you have reached limit",Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun updateGBtoKB(){
        val spinner1Item = spinner1.selectedItem.toString()
        val spinner2Item = spinner2.selectedItem.toString()
        if (editScreen1.hasFocus()){
            try {
                if(spinner1Item == getString(R.string.GB) && spinner2Item == getString(R.string.KB)){
                    str1 = editScreen1.text.toString()
                    val value = 1048576
                    val result = str1.toFloat() * value
                    val final = result.toBigDecimal()
                    editScreen2.setText("$final")
                }
                if(spinner1Item == getString(R.string.KB) && spinner2Item == getString(R.string.GB)){
                    str1 = editScreen1.text.toString()
                    val value = 0.0000009537
                    val result = str1.toLong() * value.toFloat()
                    val final = result.toBigDecimal()
                    editScreen2.setText("$final")
                }
            }catch (e:Exception){
                Toast.makeText(this,"you have reached limit",Toast.LENGTH_LONG).show()
            }
        }
        if (editScreen2.hasFocus()){
            try {
                if(spinner2Item == getString(R.string.GB) && spinner1Item == getString(R.string.KB)){
                    str1 = editScreen2.text.toString()
                    val value = 1048576
                    val result = str1.toFloat() * value
                    val final = result.toBigDecimal()
                    editScreen1.setText("$final")
                }
                if(spinner2Item == getString(R.string.KB) && spinner1Item == getString(R.string.GB)){
                    str1 = editScreen2.text.toString()
                    val value = 0.0000009537
                    val result = str1.toLong() * value.toBigDecimal().toFloat()
                    val final = result.toBigDecimal()
                    editScreen1.setText("$final")
                }
            }catch (e:Exception){
                Toast.makeText(this,"you have reached limit",Toast.LENGTH_LONG).show()
            }

        }

    }

    private fun ed1(str: String) {
        val oldStr = editScreen1.text.toString()
        val cursorPos = editScreen1.selectionStart
        val leftStr = oldStr.substring(0, cursorPos)
        val rightStr = oldStr.substring(cursorPos)
        editScreen1.setText(String.format("%s%s%s", leftStr, str, rightStr))
        editScreen1.setSelection(cursorPos + 1)

    }
    private fun ed2(str: String) {
        val oldStr2 = editScreen2.text.toString()
        val cursorPos2 = editScreen2.selectionStart
        val leftStr2 = oldStr2.substring(0, cursorPos2)
        val rightStr2 = oldStr2.substring(cursorPos2)
        editScreen2.setText(String.format("%s%s%s", leftStr2, str, rightStr2))
        editScreen2.setSelection(cursorPos2 + 1)
    }
    fun spinnerItem(){
        when(spinner1.selectedItem.toString()){
            "MegaBytes (MB)" -> {
                data_ShortForm.setText(R.string.megabyte)
            }
            "KiloBytes (KB)" -> {
                data_ShortForm.setText(R.string.kilobyte)
            }
            "GigaBytes (GB)" -> {
                data_ShortForm.setText(R.string.gigabyte)
            }
            "TeraBytes (TB)" -> {
                data_ShortForm.setText(R.string.terabyte)
            }
        }
    }
    fun spinnerItem2(){
        when(spinner2.selectedItem.toString()){
            "MegaBytes (MB)" -> {
                data_ShortForm2.setText(R.string.megabyte)
            }
            "KiloBytes (KB)" -> {
                data_ShortForm2.setText(R.string.kilobyte)
            }
            "GigaBytes (GB)" -> {
                data_ShortForm2.setText(R.string.gigabyte)
            }
            "TeraBytes (TB)" -> {
                data_ShortForm2.setText(R.string.terabyte)
            }
        }
    }
}



