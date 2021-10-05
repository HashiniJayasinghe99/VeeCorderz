package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterUser extends AppCompatActivity implements View.OnClickListener{

    private TextView et_fullname, et_age, et_email, et_password_register;
    private Button registerUser;
    private ProgressBar progressBar;


    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        mAuth = FirebaseAuth.getInstance();


        registerUser = (Button) findViewById(R.id.registerUser);
        registerUser.setOnClickListener(this);

        et_fullname = (EditText) findViewById(R.id.fullname);
        et_age = (EditText) findViewById(R.id.age);
        et_email = (EditText) findViewById(R.id.email);
        et_password_register = (EditText) findViewById(R.id.password_register);

        progressBar= (ProgressBar) findViewById(R.id.progressBar);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.registerUser:
                registerUser();
                break;

        }

    }

    private void registerUser() {

        String fullname = et_fullname.getText().toString().trim();
        String email = et_email.getText().toString().trim();
        String age = et_age.getText().toString().trim();
        String password = et_password_register.getText().toString().trim();

        if(fullname.isEmpty()) {
            et_fullname.setError("Full name is Required!");
            et_fullname.requestFocus();
            return;
        }

        if(age.isEmpty()) {
            et_age.setError("Full name is Required!");
            et_age.requestFocus();
            return;
        }

        if(email.isEmpty()) {
            et_email.setError("Full name is Required!");
            et_email.requestFocus();
            return;
        }

        if(password.isEmpty()) {
            et_password_register.setError("Full name is Required!");
            et_password_register.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            User user = new User(fullname, age, email);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if(task.isSuccessful()) {
                                        Toast.makeText(RegisterUser.this, "User has been Registered Successfully", Toast.LENGTH_SHORT).show();
                                        progressBar.setVisibility(View.VISIBLE);

                                    }

                                    //redirect to login layout
                                    else {
                                        Toast.makeText(RegisterUser.this, "Failed to Register! Try Again!!", Toast.LENGTH_SHORT).show();
                                        progressBar.setVisibility(View.GONE);
                                    }
                                }
                            });
                        } else {
                            Toast.makeText(RegisterUser.this, "Failed to Register! Try Again!!", Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
    }
}