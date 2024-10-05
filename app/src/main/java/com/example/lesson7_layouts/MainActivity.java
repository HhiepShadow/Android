package com.example.lesson7_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lesson7_layouts.LinearLayout.LinearLayout;
import com.example.lesson7_layouts.ShimmerLayout.ShimmerLayouts;

public class MainActivity extends AppCompatActivity {
    private Button btnMain;
    private Button btnToShimmerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(intent);
            }
        });

        btnToShimmerLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ShimmerLayouts.class);
                    startActivity(intent);
                }
        });
    }

    public void initWidgets() {
        btnMain = (Button) findViewById(R.id.btnMain);
        btnToShimmerLayout = (Button) findViewById(R.id.btnToShimmerLayout);
    }
}