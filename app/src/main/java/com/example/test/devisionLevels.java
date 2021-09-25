package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class devisionLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devision_levels);

        Button  buttonStartLevel1= findViewById(R.id.button5);
        buttonStartLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLevel1();
            }
        });

        Button buttonStartLevel2= findViewById(R.id.button4);
        buttonStartLevel2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){startLevel2();}
        });

        Button buttonStartLevel3= findViewById(R.id.button6);
        buttonStartLevel3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){startLevel3();}
        });
    }
    private void startLevel1(){
        Intent intent = new Intent(devisionLevels.this,devlesson1.class);
        startActivity(intent);
    }

    private void startLevel2(){
        Intent intent = new Intent(devisionLevels.this,divisionl2.class);
        startActivity(intent);
    }
    private void startLevel3(){
        Intent intent = new Intent(devisionLevels.this,level3lesson3.class);
        startActivity(intent);
    }
}