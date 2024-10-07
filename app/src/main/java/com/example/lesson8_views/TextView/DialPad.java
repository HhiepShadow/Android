package com.example.lesson8_views.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lesson8_views.R;

public class DialPad extends AppCompatActivity {
    TextView primaryTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial_pad);

        primaryTextView = (TextView) findViewById(R.id.primaryTextView);
    }

    // handle the button 1 and append the 1 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedOne(View view) {
        primaryTextView.setText(primaryTextView.getText() + "1");
    }

    // handle the button 2 and append the 2 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedTwo(View view) {
        primaryTextView.setText(primaryTextView.getText() + "2");
    }

    // handle the button 3 and append the 3 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedThree(View view) {
        primaryTextView.setText(primaryTextView.getText() + "3");
    }

    // handle the button 4 and append the 4 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedFour(View view) {
        primaryTextView.setText(primaryTextView.getText() + "4");
    }

    // handle the button 5 and append the 5 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedFive(View view) {
        primaryTextView.setText(primaryTextView.getText() + "5");
    }

    // handle the button 6 and append the 6 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedSix(View view) {
        primaryTextView.setText(primaryTextView.getText() + "6");
    }

    // handle the button 7 and append the 7 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedSeven(View view) {
        primaryTextView.setText(primaryTextView.getText() + "7");
    }

    // handle the button 8 and append the 8 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedEight(View view) {
        primaryTextView.setText(primaryTextView.getText() + "8");
    }

    // handle the button 9 and append the 9 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedNine(View view) {
        primaryTextView.setText(primaryTextView.getText() + "9");
    }

    // handle the button 0 and append the 0 to the end of the TextView
    @SuppressLint("SetTextI18n")
    public void clickedZero(View view) {
        primaryTextView.setText(primaryTextView.getText() + "0");
    }
}