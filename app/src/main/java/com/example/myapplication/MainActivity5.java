package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import androidx.appcompat.app.AppCompatViewInflater;
public class MainActivity5 extends AppCompatActivity {
EditText texplain;
DatabaseReference dbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void onClick5(View v)
    {
        texplain =  findViewById(R.id.editTextPhone);
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}