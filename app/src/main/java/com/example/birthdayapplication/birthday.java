package com.example.birthdayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class birthday extends AppCompatActivity {

    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        mTextView=(TextView)findViewById(R.id.text);
        String value=getIntent().getStringExtra("birthdayname");
        Log.d("Name",value);
        mTextView.setText("Happy Birthday\n"+value);
    }
}