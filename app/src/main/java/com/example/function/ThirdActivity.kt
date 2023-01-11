package com.example.function

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val button= findViewById<Button>(R.id.buttonTwo)

        button?.setOnClickListener {
            var user = User(
                this.findViewById<EditText>(R.id.name_input).text.toString(),
                this.findViewById<EditText>(R.id.age_input).text.toString(),
                this.findViewById<EditText>(R.id.town_input).text.toString()
            )
            Log.i("ButtonTag","actionListener")

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user",user)
            startActivity(intent)
        }
    }
}