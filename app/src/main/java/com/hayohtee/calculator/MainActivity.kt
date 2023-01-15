package com.hayohtee.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    // The two TextViews
    private lateinit var solutionTextView: TextView
    private lateinit var resultTextView: TextView

    // The buttons
    private lateinit var acButton: MaterialButton
    private lateinit var bracketButton: MaterialButton
    private lateinit var moduloButton: MaterialButton
    private lateinit var divideButton: MaterialButton
    private lateinit var sevenButton: MaterialButton
    private lateinit var eightButton: MaterialButton
    private lateinit var nineButton: MaterialButton
    private lateinit var multiplyButton: MaterialButton
    private lateinit var fourButton: MaterialButton
    private lateinit var fiveButton: MaterialButton
    private lateinit var sixButton: MaterialButton
    private lateinit var subtractButton: MaterialButton
    private lateinit var oneButton: MaterialButton
    private lateinit var twoButton: MaterialButton
    private lateinit var threeButton: MaterialButton
    private lateinit var addButton: MaterialButton
    private lateinit var zeroButton: MaterialButton
    private lateinit var dotButton: MaterialButton
    private lateinit var clearButton: MaterialButton
    private lateinit var equalButton: MaterialButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}