package com.example.ejemplosuma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1=findViewById<EditText>(R.id.editTextNumber)
        val n2=findViewById<EditText>(R.id.editTextNumber2)
        val bt=findViewById<Button>(R.id.button)
        val tres=findViewById<TextView>(R.id.textView2)
        tres.text=""
        bt.setOnClickListener {
            val num1=n1.text.toString().toInt()
            val num2=n2.text.toString().toInt()
            val sum = num1+num2
            tres.text=sum.toString()
        }
    }
}