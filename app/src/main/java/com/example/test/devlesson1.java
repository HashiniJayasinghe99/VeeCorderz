package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class devlesson1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devlesson1);

        Button buttonStartquiz= findViewById(R.id.buttonlevel1);
        buttonStartquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startquiz();
            }
        });

        }
    private void startquiz(){
        Intent intent = new Intent(devlesson1.this,devQuizMenu.class);
        startActivity(intent);
    }
    }

