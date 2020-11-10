package com.example.quizzhsuu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class ChangSetup extends Activity {
    Button BT1, BT2;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chang_setup);

        BT1 = (Button) findViewById(R.id.btn_change);
        BT2 = (Button) findViewById(R.id.btn_continue);

        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangSetup.this, SetupHighScore.class);
                startActivity(intent);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangSetup.this, Question.class);
                startActivity(intent);
            }
        });
    }
}

