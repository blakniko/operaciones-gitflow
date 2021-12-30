package com.disin.operaciones_gitflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //master
        //this a develop
    }
    fun sumar(number:Int){

        val result= number+number
        val modifyResult = 0
    }

    fun restar(number: Int){
    val result = number-number
    }
}