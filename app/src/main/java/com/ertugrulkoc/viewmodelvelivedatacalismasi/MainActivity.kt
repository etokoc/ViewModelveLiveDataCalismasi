package com.ertugrulkoc.viewmodelvelivedatacalismasi

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<TextView>(R.id.txt_title)
        val txt2 = findViewById<TextView>(R.id.txt_second)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        viewModel.currentNumber.observe(this, {
            txt1.text = viewModel.currentNumber.value.toString()
        })
        viewModel.currentBoolean.observe(this, {
            txt2.text = viewModel.currentBoolean.value.toString()
        })
        findViewById<Button>(R.id.button).setOnClickListener {
            viewModel.currentNumber.value = ++viewModel.number
            viewModel.currentBoolean.value = viewModel.number % 2 == 0
        }
    }


}