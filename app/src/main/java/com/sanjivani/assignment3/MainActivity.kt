package com.sanjivani.assignment3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.sanjivani.assignment3.R
import com.sanjivani.assignment3.SecondActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btnSendData)

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            // Key-value pairs
            intent.putExtra("text1", getString(R.string.string1))
            intent.putExtra("text2", getString(R.string.string2))
            intent.putExtra("text3", getString(R.string.string3))
            intent.putExtra("text4", getString(R.string.string4))
            intent.putExtra("text5", getString(R.string.string5))
            intent.putExtra("isActive", true)
            intent.putExtra("count", 42)
            intent.putExtra("rating", 4.5f)

            startActivity(intent)
        }
    }
}
