package com.example.quizzhsuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button BT1, BT2, BT3, BT4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BT1 = (Button)findViewById(R.id.start_btn);
        BT2 = (Button)findViewById(R.id.viewcode_btn);
        BT3 = (Button)findViewById(R.id.manual_btn);
        BT4 = (Button)findViewById(R.id.exit_btn);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionSetup.class);
                startActivity(intent);
            }
        });

        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Manual.class);
                startActivity(intent);
            }
        });

        BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Manual.class);
                startActivity(intent);
            }
        });

        BT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}