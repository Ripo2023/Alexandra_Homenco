package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.io.File;
public class MainActivity1 extends AppCompatActivity {
    private Intent MainActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
public void onClick1(View v)
{
    Intent intent = new Intent(this, MainActivity2.class);
    startActivity(intent);
}
    public void onClick11(View v)
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