package com.example.quizzhsuu;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Question extends SetupHighScore {
    Button Next;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        Next = (Button) findViewById(R.id.btn_traloi);

    }
}
