package com.example.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity4 : AppCompatActivity() {

    private val quizTitle = arrayOf("問題A","問題B","問題C","問題D")
    private val quizData = arrayOf(
        arrayOf("A0","A1","A2","A3"),
        arrayOf("B0","B1","B2","B3"),
        arrayOf("C0","C1","C2","C3"),
        arrayOf("D0","D1","D2","D3")
    )

    private val i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        //id取得
        val tvCount : TextView = findViewById(R.id.tvCount)
        val foodQ : TextView = findViewById(R.id.foodQ)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)

    //カウント数の表示
        tvCount.text = "あと4問"
        foodQ.text = quizTitle[0]
    //0~3のリストを用意
        val list = listOf(0,1,2,3)
        val num = list.shuffled()


        button.text = quizData[0][num[0]]
        button2.text = quizData[0][num[1]]
        button4.text = quizData[0][num[2]]
        button5.text = quizData[0][num[3]]
        button6.isEnabled = false

        button.setOnClickListener {
            if(button.text == quizData[i][0]){
                AlertDialog.Builder(this)
                    .setTitle("正解だよ")
                    .setPositiveButton("OK",null)
                    .show()

                button.isEnabled = false
                button2.isEnabled = false
                button4.isEnabled = false
                button5.isEnabled = false
                button6.isEnabled = true
            }else{
                inCorrect()
            }
        }
    }

    private fun correctAns(){

        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)

        if(button.text == quizData[i][0]) {
            AlertDialog.Builder(this)
                .setTitle("正解だよ")
                .setPositiveButton("OK", null)
                .show()

            button.isEnabled = false
            button2.isEnabled = false
            button4.isEnabled = false
            button5.isEnabled = false
            button6.isEnabled = true
        }
    }

    //不正解の処理
    fun inCorrect(){
        val foodQ : TextView = findViewById(R.id.foodQ)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)

        foodQ.text = "不正解 Game Over"
        button.isEnabled = false
        button2.isEnabled = false
        button4.isEnabled = false
        button5.isEnabled = false
        button6.isEnabled = false
    }

}