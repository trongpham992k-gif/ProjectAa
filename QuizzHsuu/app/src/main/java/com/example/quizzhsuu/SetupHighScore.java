package com.example.quizzhsuu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.Nullable;

public class SetupHighScore extends Activity  {
    Button BT1, BT2;
    Spinner Spin1, Spin2;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionsetup);

        BT1 = (Button) findViewById(R.id.btn_change);
        BT2 = (Button) findViewById(R.id.btn_continue);

        Spin1 = (Spinner) findViewById(R.id.spinner1);
        Spin2 = (Spinner) findViewById(R.id.spinner2);
        //tao spin
        String Arr1[] = {"5","6","7","8","9","10"};
        String Arr2[] = {"Easy","Medium","Hard"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(SetupHighScore.this, android.R.layout.simple_spinner_item,Arr1);
        ArrayAdapter arrayAdapter1 = new ArrayAdapter(SetupHighScore.this, android.R.layout.simple_spinner_item,Arr2);
        Spin1.setAdapter(arrayAdapter);
        Spin2.setAdapter(arrayAdapter1);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        // chuyen den Question
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetupHighScore.this, ChangSetup.class);
                startActivity(intent);
            }
        });

    }
}

