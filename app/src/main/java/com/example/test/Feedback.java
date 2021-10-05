package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Feedback extends AppCompatActivity {

    EditText txt_name;
    EditText txt_feedback;
    Button feedback_btnSend;
    Button feedback_btnDetails;

    ProgressDialog pd;

    //Firestore Instance
    FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        //ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Data");



        txt_name = findViewById(R.id.txt_name);
        txt_feedback = findViewById(R.id.txt_feedback);

        feedback_btnSend = findViewById(R.id.feedback_btnSend);
        feedback_btnDetails = findViewById(R.id.feedback_btnDetails);

        pd = new ProgressDialog(this);

        //Firestore
        db = FirebaseFirestore.getInstance();

        //Click Button to Upload Data
        feedback_btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Input data
                String name = txt_name.getText().toString().trim();
                String message = txt_feedback.getText().toString().trim();

                //function call to upload data
                uploadData(name, message);
            }


        });

    }

    private void uploadData(String name, String message) {

        pd.setTitle("Adding data to Firestore");

        pd.show();

        String id = UUID.randomUUID().toString();

        Map<String, Object> doc = new HashMap<>();

        doc.put("id", id); //id of data
        doc.put("name", name);
        doc.put("message", message);

        //Add this data
        db.collection("Documents").document(id).set(doc)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        //Will be called when data is entered successfully

                        pd.dismiss();
                        Toast.makeText(Feedback.this, "Feedback Uploaded Successfully", Toast.LENGTH_SHORT).show();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        //Called when error occured in data upload

                        pd.dismiss();
                        Toast.makeText(Feedback.this, e.getMessage(), Toast.LENGTH_SHORT).show();


                    }
                });
    }
}