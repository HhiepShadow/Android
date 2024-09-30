package com.example.lesson5_components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lesson5_components.ContentProviders.MyContentProvider;
import com.example.lesson5_components.Services.MyService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button start, stop, addBtn, loadBtn;
    private TextView textViewList;
    private EditText editTextAdd;

    Uri CONTENT_URI = Uri.parse("com.example.lesson5_components/items");
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

        editTextAdd = (EditText) findViewById(R.id.editTextAdd);
        addBtn = (Button) findViewById(R.id.btnAdd);
        loadBtn = (Button) findViewById(R.id.btnLoad);
        textViewList = (TextView) findViewById(R.id.textViewList);
        editTextAdd = (EditText) findViewById(R.id.editTextAdd);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContentValues contentValues = new ContentValues();
                String textAdd = editTextAdd.getText().toString();
                contentValues.put("name", textAdd);

                getContentResolver().insert(MyContentProvider.CONTENT_URI, contentValues);

                Toast.makeText(MainActivity.this, "New Record inserted", Toast.LENGTH_LONG).show();
            }
        });
        loadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor = getContentResolver().query(Uri.parse("content://com.example.lesson5_components/items"), null, null, null, null);

                if(cursor.moveToFirst()) {
                    StringBuilder stringBuilder = new StringBuilder();

                    while (!cursor.isAfterLast()) {
                        stringBuilder.append("\n" + cursor.getString(cursor.getColumnIndex("id")) + " - " + cursor.getString(cursor.getColumnIndex("name")));
                        cursor.moveToNext();
                    }
                    textViewList.setText(stringBuilder);
                } else {
                    textViewList.setText("No records found");
                }
            }
        });
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