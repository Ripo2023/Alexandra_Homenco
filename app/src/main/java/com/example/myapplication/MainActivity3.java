package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onClick3(View v)
    {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void onClick33(View v)
    {
        File file = new File("/data/data/com.example.myapplication/files/Users.txt");
        if (file.exists()) {
            Intent intent = new Intent(this, MainActivity7.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this, MainActivity5.class);
            startActivity(intent);
        }
    }
}