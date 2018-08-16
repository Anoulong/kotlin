package com.tutorial.programiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = "Superman"

        Log.d(TAG, name)


        var test: Number = 12.2
        Log.d(TAG,"$test")

        test = 12
        // Int smart cast from Number
        Log.d(TAG,"$test")

        test = 120L
        // Long smart cast from Number
        Log.d(TAG,"$test")

        val letter: Char
        letter = 'k'
        Log.d(TAG,"$letter")

        val flag = true
        Log.d(TAG,"$flag")
    }
}
