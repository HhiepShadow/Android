package com.example.lesson7_layouts.ShimmerLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson7_layouts.R;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class ShimmerLayouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimmer_layout);

        ShimmerLayout shimmerLayout = findViewById(R.id.shimmer_layout);
        shimmerLayout.startShimmerAnimation();
    }
}