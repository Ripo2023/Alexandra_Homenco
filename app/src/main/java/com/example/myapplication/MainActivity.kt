package com.example.myapplication
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClick(v: View?)
    {
        val file = File("/data/data/com.example.myapplication/files/Users.txt")
        if (file.exists()) {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
        else
        {
            val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }

    }

}