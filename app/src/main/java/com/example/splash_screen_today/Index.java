package com.example.splash_screen_today;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Index extends AppCompatActivity {
TextView textbyme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        textbyme = (TextView) findViewById(R.id.textView2);
        Intent i= getIntent();
        String getdata=i.getStringExtra("mars");
        textbyme.setText(getdata);
    }
}