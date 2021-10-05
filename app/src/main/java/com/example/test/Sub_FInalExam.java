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

public class Sub_FInalExam extends AppCompatActivity {

    EditText q1, q2, q3, q4;
    Button saveBtn;

    ProgressDialog pd;

    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_final_exam);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Data");

        Toast.makeText(Sub_FInalExam.this, "Success Test", Toast.LENGTH_SHORT).show();

        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        saveBtn = findViewById(R.id.saveBtn);

        pd = new ProgressDialog(this);

        db = FirebaseFirestore.getInstance();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Q1 = q1.getText().toString().trim();
                String Q2 = q2.getText().toString().trim();
                String Q3 = q3.getText().toString().trim();
                String Q4 = q4.getText().toString().trim();

                uploadData(Q1,Q2,Q3,Q4);
            }


        });

    }

    private void uploadData(String q1, String q2, String q3, String q4) {

        pd.setTitle("Updating Data to Firestore");
        pd.show();

        String id = UUID.randomUUID().toString();
        Map<String , Object> doc = new HashMap<>();

        doc.put("id",id);
        doc.put("Q1",q1);
        doc.put("Q2",q2);
        doc.put("Q3",q3);
        doc.put("Q4",q4);


        db.collection("Documents").document(id).set(doc)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        pd.dismiss();
                        Toast.makeText(Sub_FInalExam.this, "Uploaded", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        pd.dismiss();
                        Toast.makeText(Sub_FInalExam.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}