package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DevisionStartingMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devision_starting_menu);

            Button buttonStartLessons= findViewById(R.id.mquizdivi);
            buttonStartLessons.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startLessons();
                }
            });

        Button buttonStartQuiz= findViewById(R.id.mlessondivi);
        buttonStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });

    }
    private void startLessons(){
        Intent intent = new Intent(DevisionStartingMenu.this,devisionLevels.class);
        startActivity(intent);
    }

    private void startQuiz(){
        Intent intent = new Intent(DevisionStartingMenu.this,devQuizMenu.class);
        startActivity(intent);
    }
}