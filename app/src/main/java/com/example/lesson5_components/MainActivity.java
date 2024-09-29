package com.example.lesson5_components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lesson5_components.Services.MyService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button start, stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void initWidgets() {
        start = (Button) findViewById(R.id.startServiceBtn);
        stop = (Button) findViewById(R.id.stopServiceBtn);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == start){
            startService(new Intent(this, MyService.class));
        } else if (view == stop) {
            stopService(new Intent(
                    this, MyService.class
            ));
        }
    }
}