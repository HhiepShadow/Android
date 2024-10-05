package com.example.lesson7_layouts.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lesson7_layouts.R;

public class LinearLayout extends AppCompatActivity {
    private TextView textViewLL;
    private Button btnLL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        initWidgets();

        btnLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewLL.setText("Button clicked");
            }
        });
    }

    public void initWidgets() {
        textViewLL = (TextView) findViewById(R.id.textViewLL);
        btnLL = (Button) findViewById(R.id.btnLL);
    }
}