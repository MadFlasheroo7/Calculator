package com.example.calculator

import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.SpannableStringBuilder
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_currency.*
import kotlinx.android.synthetic.main.activity_currency.button0
import kotlinx.android.synthetic.main.activity_currency.button1
import kotlinx.android.synthetic.main.activity_currency.button2
import kotlinx.android.synthetic.main.activity_currency.button3
import kotlinx.android.synthetic.main.activity_currency.button4
import kotlinx.android.synthetic.main.activity_currency.button5
import kotlinx.android.synthetic.main.activity_currency.button6
import kotlinx.android.synthetic.main.activity_currency.button7
import kotlinx.android.synthetic.main.activity_currency.button8
import kotlinx.android.synthetic.main.activity_currency.button9
import kotlinx.android.synthetic.main.activity_currency.buttonDelete
import kotlinx.android.synthetic.main.activity_currency.buttonDot
import kotlinx.android.synthetic.main.activity_time.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.URL
class Currency : AppCompatActivity() {
//    var baseCurrency = "USD"
//    var toCurrency = "INR"
    private var convertionRate = 0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency)
        currySpin1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                spinnerItem()
                editText1.requestFocus()
                editText1.setText("")
                editText2.setText("")
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        currySpin2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                spinnerItem()
                editText1.setText("")
                editText2.setText("")
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
        info.setOnClickListener {
            dialogBox()
        }
        spinners()
        textUpdate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            editText1.showSoftInputOnFocus = false
            editText2.showSoftInputOnFocus = false
        } else { // API 11-20
            editText1.setTextIsSelectable(true)
            editText2.setTextIsSelectable(true)
        }

        arrowUp.setOnClickListener {
            editText2.clearFocus()
            editText1.requestFocus()
        }
        arrowDown.setOnClickListener {
            editText1.clearFocus()
            editText2.requestFocus()
        }

        button1.setOnClickListener {
            if (editText1.hasFocus()){
                et1("1")
                apiResult()
            }else{
                et2("1")
                apiResult()
            }
        }
        button2.setOnClickListener {
            if (editText1.hasFocus()){
                et1("2")
                apiResult()
            }else{
                et2("2")
                apiResult()
            }
        }
        button3.setOnClickListener {
            if (editText1.hasFocus()){
                et1("3")
                apiResult()
            }else{
                et2("3")
                apiResult()
            }
        }
        button4.setOnClickListener {
            if (editText1.hasFocus()){
                et1("4")
                apiResult()
            }else{
                et2("4")
                apiResult()
            }
        }
        button5.setOnClickListener {
            if (editText1.hasFocus()){
                et1("5")
                apiResult()
            }else{
                et2("5")
                apiResult()
            }
        }
        button6.setOnClickListener {
            if (editText1.hasFocus()){
                et1("6")
                apiResult()
            }else{
                et2("6")
                apiResult()
            }
        }
        button7.setOnClickListener {
            if (editText1.hasFocus()){
                et1("7")
                apiResult()
            }else{
                et2("7")
                apiResult()
            }
        }
        button8.setOnClickListener {
            if (editText1.hasFocus()){
                et1("8")
                apiResult()
            }else{
                et2("8")
                apiResult()
            }
        }
        button9.setOnClickListener {
            if (editText1.hasFocus()){
                et1("9")
                apiResult()
            }else{
                et2("9")
                apiResult()
            }
        }
        button0.setOnClickListener {
            if (editText1.hasFocus()){
                et1("0")
                apiResult()
            }else{
                et2("0")
                apiResult()
            }
        }
        buttonDot.setOnClickListener {
            if (editText1.hasFocus()){
                et1(".")
                apiResult()
            }else{
                et2(".")
                apiResult()
            }
        }
        buttonClearAll.setOnClickListener {
            editText1.setText("")
            editText2.setText("")
        }
        buttonDelete.setOnClickListener {
            if (editText1.hasFocus())
            {
                val cursorPos = editText1.selectionStart
                val len = editText1.text.length
                if (len == 0){
                    editText1.setText("")
                    editText2.setText("")
                }
                if (cursorPos != 0 && len !=0){
                    val spannableStringBuilder : SpannableStringBuilder = editText1.text as SpannableStringBuilder
                    spannableStringBuilder.replace(cursorPos - 1, cursorPos, "")
                    editText1.text = spannableStringBuilder
                }
                val result = editText1.text.toString()
                editText1.setSelection(result.length)
            }
            else
            {
                val cursorPos = editText2.selectionStart
                val len = editText2.text.length
                if (len == 0){
                    editText1.setText("")
                    editText2.setText("")
                }
                if (cursorPos != 0 && len !=0){
                    val spannableStringBuilder : SpannableStringBuilder = editText2.text as SpannableStringBuilder
                    spannableStringBuilder.replace(cursorPos - 1, cursorPos, "")
                    editText2.text = spannableStringBuilder
                }
                val result = editText2.text.toString()
                editText2.setSelection(result.length)
            }
        }
    }

    private fun dialogBox(){
        MaterialAlertDialogBuilder(this)
            .setTitle(R.string.title)
            .setMessage(R.string.infoMSG)
            .show()
    }
    private fun et1(str: String) {
        val oldStr = editText1.text.toString()
        val cursorPos = editText1.selectionStart
        val leftStr = oldStr.substring(0, cursorPos)
        val rightStr = oldStr.substring(cursorPos)
        editText1.setText(String.format("%s%s%s", leftStr, str, rightStr))
        editText1.setSelection(cursorPos + 1)

    }
    private fun et2(str: String) {
        val oldStr2 = editText2.text.toString()
        val cursorPos2 = editText2.selectionStart
        val leftStr2 = oldStr2.substring(0, cursorPos2)
        val rightStr2 = oldStr2.substring(cursorPos2)
        editText2.setText(String.format("%s%s%s", leftStr2, str, rightStr2))
        editText2.setSelection(cursorPos2 + 1)
    }

    private fun apiResult()
    {
        spinnerItem()
        if (editText1.hasFocus()){
            val baseCurrency = currySpin1.selectedItem.toString()
            val toCurrency = currySpin2.selectedItem.toString()
            if (editText1 != null && editText1.text.isNotEmpty() ){
                val api = "https://api.ratesapi.io/api/latest?base=$baseCurrency&symbols=$toCurrency"
                if (baseCurrency == toCurrency)
                {
                    Toast.makeText(applicationContext,"Cannot Convert the same currency",Toast.LENGTH_LONG).show()
                }
                else
                {
                    GlobalScope.launch(Dispatchers.IO) {
                        try {
                            val apiResult = URL(api).readText()
                            val jsonObject = JSONObject(apiResult)
                            convertionRate = jsonObject.getJSONObject("rates").getString(toCurrency).toFloat()
                            Log.d("Main","$convertionRate")
                            Log.d("Main",apiResult)
                            withContext(Dispatchers.Main){
                                val text = ((editText1.text.toString().toFloat()) * convertionRate).toString()
//                                val finalResult = text.toInt()
                                editText2?.setText(text)
                            }
                        }catch (e:Exception){
                            Log.e("Main","$e")
                        }
                    }
                }
            }
        }
        if (editText2.hasFocus()){
            val baseCurrency = currySpin2.selectedItem.toString()
            val toCurrency = currySpin1.selectedItem.toString()
            if (editText2 != null && editText2.text.isNotEmpty() ){
                val api = "https://api.ratesapi.io/api/latest?base=$baseCurrency&symbols=$toCurrency"
                if (baseCurrency == toCurrency)
                {
                    Toast.makeText(applicationContext,"Cannot Convert the same currency",Toast.LENGTH_LONG).show()
                }
                else
                {
                    GlobalScope.launch(Dispatchers.IO) {
                        try {
                            val apiResult = URL(api).readText()
                            val jsonObject = JSONObject(apiResult)
                            convertionRate = jsonObject.getJSONObject("rates").getString(toCurrency).toFloat()
                            Log.d("Main","$convertionRate")
                            Log.d("Main",apiResult)
                            withContext(Dispatchers.Main){
                                val text = ((editText2.text.toString().toFloat()) * convertionRate).toString()
                                editText1?.setText(text)
                            }
                        }catch (e:Exception){
                            Log.e("Main","$e")
                        }
                    }
                }
            }
        }

    }
    private fun spinners(){
        if (editText1.hasFocus()){
            spinnerItem()
        var baseCurrency = currySpin1.selectedItem.toString()
        var toCurrency = currySpin2.selectedItem.toString()
        currySpin1.onItemSelectedListener = (object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                baseCurrency = parent?.getItemAtPosition(position).toString()
                apiResult()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        })
        currySpin2.onItemSelectedListener = (object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                toCurrency = parent?.getItemAtPosition(position).toString()
                apiResult()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        })
    }
        if (editText2.hasFocus()){

            spinnerItem()
            var baseCurrency = currySpin2.selectedItem.toString()
            var toCurrency = currySpin1.selectedItem.toString()
            currySpin2.onItemSelectedListener = (object  : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                    baseCurrency = parent?.getItemAtPosition(position).toString()
                    apiResult()
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            })
            currySpin1.onItemSelectedListener = (object  : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                    toCurrency = parent?.getItemAtPosition(position).toString()
                    apiResult()
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            })
        }
    }
    private fun spinnerItem(){
        when(currySpin1.selectedItem.toString()){
            "USD" -> {
                symbol.setText(R.string.USD)
            }
            "INR" -> {
                symbol.setText(R.string.INR)
            }
            "CAD" -> {
                symbol.setText(R.string.CAD)
            }
            "EUR" -> {
                symbol.setText(R.string.EUR)
            }
            "GBP" -> {
                symbol.setText(R.string.GBP)
            }
            "CNY" -> {
                symbol.setText(R.string.CNY)
            }
        }
        when(currySpin2.selectedItem.toString()){
            "USD" -> {
                symbol2.setText(R.string.USD)
            }
            "INR" -> {
                symbol2.setText(R.string.INR)
            }
            "CAD" -> {
                symbol2.setText(R.string.CAD)
            }
            "EUR" -> {
                symbol2.setText(R.string.EUR)
            }
            "GBP" -> {
                symbol2.setText(R.string.GBP)
            }
            "CNY" -> {
                symbol2.setText(R.string.CNY)
            }
        }
    }
    private fun textUpdate(){

        spinnerItem()

        if (editText1.hasFocus()){
//            apiResult()
            editText1.addTextChangedListener(object : TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    try {
                        apiResult()
                    }catch (e:Exception){
                        Log.e("Main","$e")
                    }
                }
                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    try {
                        apiResult()
                    }catch (e:Exception){
                        Log.e("Main","$e")
                    }
                }
                override fun afterTextChanged(p0: Editable?) {
                    try {
                        apiResult()
                    }catch (e:Exception){
                        Log.e("Main","$e")
                    }
                }
            })
        }
        if (editText2.hasFocus()){
            editText2.addTextChangedListener(object : TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    try {
                        apiResult()
                    }catch (e:Exception){
                        Log.e("Main","$e")
                    }
                }
                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    try {
                        apiResult()
                    }catch (e:Exception){
                        Log.e("Main","$e")
                    }
                }
                override fun afterTextChanged(p0: Editable?) {
                    try {
                        apiResult()
                    }catch (e:Exception){
                        Log.e("Main","$e")
                    }
                }
            })
        }
    }
}