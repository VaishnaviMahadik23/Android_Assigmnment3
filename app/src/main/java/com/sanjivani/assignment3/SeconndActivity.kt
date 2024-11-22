package com.sanjivani.assignment3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textViewDisplay)
        val button: Button = findViewById(R.id.btnToThird)

        // Retrieve data from Intent
        val text1 = intent.getStringExtra("text1")
        val text2 = intent.getStringExtra("text2")
        val text3 = intent.getStringExtra("text3")
        val text4 = intent.getStringExtra("text4")
        val text5 = intent.getStringExtra("text5")
        val isActive = intent.getBooleanExtra("isActive", false)
        val count = intent.getIntExtra("count", 0)
        val rating = intent.getFloatExtra("rating", 0f)

        // Log all data
        Log.d("SecondActivity", "Text1: $text1, Text2: $text2, Text3: $text3, Text4: $text4, Text5: $text5")
        Log.d("SecondActivity", "Boolean: $isActive, Integer: $count, Float: $rating")

        // Show data in TextView
        textView.text = """
            $text1
            $text2
            $text3
            $text4
            $text5
            Boolean: $isActive
            Integer: $count
            Float: $rating
        """.trimIndent()

        // Button to navigate to ThirdActivity
        button.setOnClickListener {
            val finalData = """
                $text1 $text2 $text3 $text4 $text5 Boolean: $isActive Integer: $count Float: $rating
            """.trimIndent()

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("finalData", finalData)
            startActivity(intent)
        }
    }
}
