package com.example.lesson8_views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lesson8_views.TextView.ClipBoard.Clipboard;
import com.example.lesson8_views.TextView.DialPad;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnToDialPad, btnToClipboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();

    }

    public void initWidgets() {
        // Lesson 8-1: TextView
        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("TextView clicked");
            }
        });

        btnToDialPad = (Button) findViewById(R.id.btnToDial);
        btnToDialPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialPad.class);
                startActivity(intent);

            }
        });

        btnToClipboard = (Button) findViewById(R.id.btnToClipboard);
        btnToClipboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Clipboard.class);
                startActivity(intent);
            }
        });
    }
}