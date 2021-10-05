package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ExampleFeedback extends AppCompatActivity {

    EditText txt_name2;
    EditText txt_feedback2;
    Button feedback_btnSend2;
    Button feedback_btnDetails2;

    DatabaseReference studentDbRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_feedback);

        txt_name2 = findViewById(R.id.txt_name2);
        txt_feedback2 = findViewById(R.id.txt_feedback2);
        feedback_btnSend2 = findViewById(R.id.feedback_btnSend2);
        feedback_btnDetails2 = findViewById(R.id.feedback_btnDetails2);

        studentDbRef = FirebaseDatabase.getInstance().getReference().child("Students");

        feedback_btnSend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insertStudentData();
            }
        });

    }

    private void insertStudentData() {

        String name = txt_name2.getText().toString();
        String message = txt_feedback2.getText().toString();

        Students students = new Students(name, message);

        studentDbRef.push().setValue(students);
        Toast.makeText(ExampleFeedback.this, "Feedback sent!", Toast.LENGTH_SHORT).show();
    }
}