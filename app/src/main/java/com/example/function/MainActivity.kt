package com.example.function

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button= findViewById<Button>(R.id.buttonOne)
        button?.setOnClickListener {
            Log.i("ButtonTag","actionListener")
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

}
