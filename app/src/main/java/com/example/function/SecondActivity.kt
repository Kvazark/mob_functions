package com.example.function

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity




class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()
        val user: User? = intent.getSerializableExtra("user") as User?
        this.findViewById<TextView>(R.id.name).text = "Имя: "+user?.userName
        this.findViewById<TextView>(R.id.age).text = "Возраст: "+user?.age
        this.findViewById<TextView>(R.id.town).text ="Город: "+user?.town
//        textTitle.text="$newText"
//        text.setText("Выбран ${radio.text}").toString()

    }
}
