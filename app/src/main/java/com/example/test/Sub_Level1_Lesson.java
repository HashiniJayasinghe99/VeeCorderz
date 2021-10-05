package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sub_Level1_Lesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_level1_lesson);

        final TextView tv_lesson1 = findViewById(R.id.tv_lesson1);
        final Button home_lesson1 = findViewById(R.id.btn_backHome_lesson1);

        home_lesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Sub_Level1_Lesson.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}