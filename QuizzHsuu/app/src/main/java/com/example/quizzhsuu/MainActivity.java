package com.example.quizzhsuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Manual, Quit, HighScore, SetupHighScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Manual = (Button)findViewById(R.id.btn_manual);
        Quit = (Button)findViewById(R.id.exit_btn);
        HighScore = (Button)findViewById(R.id.viewcode_btn);
        SetupHighScore = (Button)findViewById(R.id.start_btn);

        // button start
        SetupHighScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SetupHighScore.class);
                startActivity(intent);
            }
        });

        // chuyen den manual
        Manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Manual.class);
                startActivity(intent);
            }
        });

        //chuyen den highscore
        HighScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HighScore.class);
                startActivity(intent);
            }
        });

        // thoat ung dung
        Quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    ///hbjhdsbjdfcbhjfdvfdv   gfgvfvgfv
//gưèwewfwfwfewfwềwfwewèwèwèwèwewè
}