package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.io.FileOutputStream;
import java.io.IOException;
public class MainActivity5 extends AppCompatActivity {
EditText texplain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void onClick5(View v) throws IOException {
        FileOutputStream f;
        EditText text = findViewById(R.id.editTextPhone);
        f = openFileOutput("Users", Context.MODE_WORLD_READABLE);
        f.write(text.getText().toString().getBytes());
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
}