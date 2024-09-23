package com.example.tictactoegame

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button

    lateinit var b1: String
    lateinit var b2: String
    lateinit var b3: String
    lateinit var b4: String
    lateinit var b5: String
    lateinit var b6: String
    lateinit var b7: String
    lateinit var b8: String
    lateinit var b9: String

    var flag = 0 //Indicates whose turn it is
    var count = 0 //Count moves

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
    }
    fun check(v: View){
        val currentBtn: Button = v as Button
        if (currentBtn.getText().toString() == "") {
            if (flag == 0) {
                currentBtn.setText("X")
                flag = 1
            } else {
                currentBtn.setText("O")
                flag = 0
            }
            count++
            if (count > 4) {
                b1 = btn1.getText().toString()
                b2 = btn2.getText().toString()
                b3 = btn3.getText().toString()
                b4 = btn4.getText().toString()
                b5 = btn5.getText().toString()
                b6 = btn6.getText().toString()
                b7 = btn7.getText().toString()
                b8 = btn8.getText().toString()
                b9 = btn9.getText().toString()

                //condition
                if (b1 == b2 && b3 == b4 && b1 != "") {
                    //1
                    Toast.makeText(this, "Winner is: $b1", Toast.LENGTH_SHORT).show()
                    newGame()
                } else if (b4 == b5 && b5 == b6 && b4 != "") {
                    //2
                    Toast.makeText(this, "Winner is: $b4", Toast.LENGTH_SHORT).show()
                    newGame()
                } else if (b7 == b8 && b8 == b9 && b7 != "") {
                    //3
                    Toast.makeText(this, "Winner is: $b7", Toast.LENGTH_SHORT).show()
                    newGame()
                } else if (b1 == b4 && b4 == b7 && b1 != "") {
                    //4
                    Toast.makeText(this, "Winner is: $b1", Toast.LENGTH_SHORT).show()
                    newGame()
                } else if (b2 == b5 && b5 == b8 && b2 != "") {
                    //5
                    Toast.makeText(this, "Winner is: $b2", Toast.LENGTH_SHORT).show()
                    newGame()
                } else if (b3 == b6 && b6 == b9 && b3 != "") {
                    //6
                    Toast.makeText(this, "Winner is: $b3", Toast.LENGTH_SHORT).show()
                    newGame()
                } else if (b1 == b5 && b5 == b9 && b1 != "") {
                    //7
                    Toast.makeText(this, "Winner is: $b1", Toast.LENGTH_SHORT).show()
                    newGame()
                } else if (b3 == b5 && b5 == b7 && b3 != "") {
                    //8
                    Toast.makeText(this, "Winner is: $b3", Toast.LENGTH_SHORT).show()
                    newGame()
                } else if (b1 != "" && b2 != "" && b3 != "" &&
                           b4 != "" && b5 != "" && b6 != "" &&
                           b7 != "" && b8 != "" && b9 != ""){
                    Toast.makeText(this, "Game is Drawn", Toast.LENGTH_SHORT).show()
                    newGame()
                }
            }
        }
    }
    fun newGame(){
        btn1.setText("")
        btn2.setText("")
        btn3.setText("")
        btn4.setText("")
        btn5.setText("")
        btn6.setText("")
        btn7.setText("")
        btn8.setText("")
        btn9.setText("")
        count =0
        flag = 0
    }
}