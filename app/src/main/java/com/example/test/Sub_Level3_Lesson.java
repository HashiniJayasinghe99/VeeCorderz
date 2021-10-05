package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sub_Level3_Lesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_level3_lesson);

        final TextView tv_lesson3 = findViewById(R.id.tv_lesson3);
        final Button home_lesson3 = findViewById(R.id.btn_backHome_lesson3);

        home_lesson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Sub_Level3_Lesson.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}