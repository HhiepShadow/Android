package com.example.lesson8_views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();

    }

    public void initWidgets() {
        // Lesson 8-1: TextView
        textView = (TextView) findViewById(R.id.textView);
    }
}