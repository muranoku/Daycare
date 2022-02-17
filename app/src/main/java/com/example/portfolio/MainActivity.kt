package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ed1:EditText = findViewById(R.id.ed1)
        var ed2:EditText = findViewById(R.id.ed2)
        var btnAdd:Button = findViewById(R.id.btnAdd)
        var btnDec:Button = findViewById(R.id.btnDec)
        var tvAns:TextView = findViewById(R.id.tvAns)
        var btnClear:Button = findViewById(R.id.btnClear)
        var btnTime:Button = findViewById(R.id.btnTime)
        var btnDiv:Button = findViewById(R.id.btnDiv)
        val btnRet:Button = findViewById(R.id.btnRet)

        btnRet.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        btnAdd.setOnClickListener{
            var sum:Int = ed1.text.toString().toInt() + ed2.text.toString().toInt()
            tvAns.text = "合計は" + sum


        }

        btnDec.setOnClickListener {
            var sum:Int = ed1.text.toString().toInt() - ed2.text.toString().toInt()
            tvAns.text = "合計は" + sum
        }

        btnTime.setOnClickListener {
            var sum:Int = ed1.text.toString().toInt() * ed2.text.toString().toInt()
            tvAns.text = "合計は" + sum
        }

        btnDiv.setOnClickListener {
            var sum:Int = ed1.text.toString().toInt() % ed2.text.toString().toInt()
            tvAns.text = "合計は" + sum
        }
        btnClear.setOnClickListener {
            ed1.text.clear()
            ed2.text.clear()
            tvAns.text = "答え"
        }

    }
}