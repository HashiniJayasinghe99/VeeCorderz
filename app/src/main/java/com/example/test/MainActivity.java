package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button addlevel1 = findViewById(R.id.btn_level1);
        final Button addlevel2 = findViewById(R.id.btn_level2);
        final Button addlevel3 = findViewById(R.id.btn_level3);
        final Button lessons = findViewById(R.id.btn_lessons);
        final Button btn_exam = findViewById(R.id.btn_exam);
        final ImageButton btn_back_main = findViewById(R.id.btn_back_main);

        addlevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Level 01";

                if (selectedTopicName.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Select the Level", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,Sub_QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }

            }
        });

        addlevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Level 02";

                if (selectedTopicName.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Select the Level", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,Sub_QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }

            }
        });

        addlevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Level 03";

                if (selectedTopicName.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please Select the Level", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,Sub_QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }

            }
        });

         lessons.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(MainActivity.this,Lessons.class);
                 startActivity(intent);
             }
         });

        btn_exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Sub_FInalExam.class);
                startActivity(intent);
            }
        });

        btn_back_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });


    }



}