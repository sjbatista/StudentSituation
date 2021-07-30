package br.com.salosoftwares.mobile.studentsituation

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = buttonCalculate
        val txtResult = result
        var testNumberOfClicks=0
        btnCalculate.setOnClickListener {
            try {
                val list1 = listOf(123)
                val a=list1[6]
            }catch (e: IndexOutOfBoundsException){
                val a=0
            }
            val scoreOne = Integer.parseInt(scoreStudent1.text.toString())
            val scoreTwo = Integer.parseInt(scoreStudent2.text.toString())
            val media = (scoreOne+scoreTwo)/2
            val subsences = Integer.parseInt(numberSubsences.text.toString())
            if(subsences<=10 && media>=6){
                txtResult.setTextColor(Color.GREEN)
                result.setText("Aprovado !"+"\n"+
                        "Foram $subsences faltas e media $media")

            }else{
                txtResult.setTextColor(Color.RED)
                txtResult.setText("Reprovado !"+"\n"+
                        "Foram $subsences faltas e media $media")
            }

        }
    }
}