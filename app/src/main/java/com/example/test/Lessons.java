package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lessons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        final Button level1 = findViewById(R.id.btn_lvl1);
        final Button level2 = findViewById(R.id.btn_lvl2);
        final Button level3 = findViewById(R.id.btn_lvl3);

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Lessons.this,Sub_Level1_Lesson.class);
                startActivity(intent);
            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Lessons.this,Sub_Level2_Lesson.class);
                startActivity(intent);
            }
        });

        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Lessons.this,Sub_Level3_Lesson.class);
                startActivity(intent);
            }
        });
    }
}