package com.example.navegacionbasica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var onCreate = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(javaClass.name, "onCreate $onCreate")
        onCreate++
        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)
        val et = findViewById<EditText>(R.id.edit)

        boton1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        boton2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            var largo = et.text.length
            intent.putExtra("Longitud:",largo)
            startActivity(intent)
        }
        boton3.setOnClickListener {
            val aleatorio = listOf(
                MainActivity2::class.java,
                MainActivity3::class.java
            )
            val intent = Intent(this, aleatorio.random())
            startActivity(intent)
        }

    }
}