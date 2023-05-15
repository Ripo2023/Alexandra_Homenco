package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void onClick4(View v)
    {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);

    }
    public void onClick44(View v)
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