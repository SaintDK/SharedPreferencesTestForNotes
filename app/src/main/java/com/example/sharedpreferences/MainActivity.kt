package com.example.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val save_key: String = "save_key1"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.button)
        val myButton1: Button = findViewById(R.id.button1)
        val editText: EditText = findViewById(R.id.editTextTextPersonName)
        val textPlace: TextView = findViewById(R.id.textPlace)

        val sharedPreferences = getSharedPreferences("Test", Context.MODE_PRIVATE)

        myButton.setOnClickListener {
            val edit: SharedPreferences.Editor = sharedPreferences.edit()
            edit.putString(save_key, editText.getText().toString())
            edit.apply()

        }

        myButton1.setOnClickListener {
            textPlace.setText(sharedPreferences.getString(save_key,"empty"))

        }

    }



}