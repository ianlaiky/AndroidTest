package com.example.ian.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("data1")){
            TextView tc = findViewById(R.id.textView);
            String text1 = (String) getIntent().getExtras().get("data1");
            tc.setText(text1);
        }


    }
}
