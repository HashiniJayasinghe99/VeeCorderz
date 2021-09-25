package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Level1 extends AppCompatActivity {

    private TextView Text2;
    private Button lesson2;
    private Button quiz1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        final Button lesson2 = findViewById(R.id.lesson2);
        final Button quiz1 = findViewById(R.id.quiz1);
        final TextView Text2 = findViewById(R.id.Text2);

        lesson2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Level1.this, Level1_Quiz.class);
                startActivity(intent);
            }
        });

        quiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Level1.this, Level1_Quiz.class);
                startActivity(intent);
            }

        });
    }
}