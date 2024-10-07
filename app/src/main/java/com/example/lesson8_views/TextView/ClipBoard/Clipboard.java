package com.example.lesson8_views.TextView.ClipBoard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lesson8_views.R;

public class Clipboard extends AppCompatActivity {
    private EditText txtCopy;
    private Button btnCopy;
    ClipData clipData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipboard);

        initWidgets();

        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);


        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textCopy = txtCopy.getText().toString();

                clipData = ClipData.newPlainText("text", textCopy);

                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(Clipboard.this, "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void initWidgets() {
        txtCopy = (EditText) findViewById(R.id.txtCopy);
        btnCopy = (Button) findViewById(R.id.btnCopy);
    }
}