package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void onClick6(View v)
    {
        EditText t = findViewById(R.id.editTextPhone);
        if(t.getText().toString().equals("1g4q8"))
        {
            Intent intent = new Intent(this, MainActivity7.class);
            startActivity(intent);
        }
      else
        {
            t.setHint("Try another one time");
        }

    }
}