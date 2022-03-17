package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnCalc: Button = findViewById(R.id.btnCalc)
        val button3: Button = findViewById(R.id.button3)
        val btnQuiz:Button = findViewById(R.id.btnQuiz)

        //画面遷移実装
        button3.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }

        btnCalc.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnQuiz.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
    }




}

