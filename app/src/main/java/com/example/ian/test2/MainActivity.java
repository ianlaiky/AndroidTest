package com.example.ian.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivity = findViewById(R.id.button2);
        secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(getApplicationContext(),SecondActivity.class);
                nextIntent.putExtra("data1","Hello world");
                startActivity(nextIntent);

            }
        });

        Button googleBtn = findViewById(R.id.gBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.google.com";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW,webaddress);

                if(gotoGoogle.resolveActivity(getPackageManager())!=null){
                    startActivity(gotoGoogle);
                }
            }
        });


    }
}
