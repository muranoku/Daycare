package com.example.portfolio

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AlertDialog

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val eatBut: Button = findViewById(R.id.eatBut)
        val eatlist:ListView = findViewById((R.id.eatlist))
        val buttonRet2: Button = findViewById(R.id.buttonRet2)

        buttonRet2.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            mutableListOf()

        )

        eatlist.adapter = adapter

        eatBut.setOnClickListener {
            val el = EditText(this)
            AlertDialog.Builder(this)
                .setTitle("項目の追加")
                .setMessage("何をする")
                .setView(el)
                .setPositiveButton("追加",DialogInterface.OnClickListener { dialogInterface, i ->
                    val mytodo = el.text.toString()
                    adapter.add(mytodo)
                })
                .setNegativeButton("キャンセル",null)
                .show()

        }


        eatlist.setOnItemClickListener { adapterView, view, i, l ->
            AlertDialog.Builder(this)
                .setTitle("削除しますか？")
                .setPositiveButton("Yes", DialogInterface.OnClickListener { _, _ ->
                    adapter.remove(adapter.getItem(i))
                    //adapter.notifyDataSetChanged()
                })
                .setNegativeButton("No", null)
                .show()
        }

        }
}