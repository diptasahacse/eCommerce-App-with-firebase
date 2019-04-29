package com.example.blogapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
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

public class Signin extends AppCompatActivity implements View.OnClickListener {

    private EditText signinemail,signinpass;
    private TextView newuserregister;
    private Button signin;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        this.setTitle("Sign In");

        signinemail = findViewById(R.id.signinemailid);
        signinpass = findViewById(R.id.signinpassid);
        newuserregister = findViewById(R.id.newuserregisterid);
        signin = findViewById(R.id.signinid);
        progressBar = findViewById(R.id.progressbarid);
        progressBar.setVisibility(View.INVISIBLE);
        mAuth = FirebaseAuth.getInstance(); //firebase


        signin.setOnClickListener(this);
        newuserregister.setOnClickListener(this);

    }







    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.newuserregisterid)
        {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);


        }
        if(v.getId() == R.id.signinid)
        {
            String email = signinemail.getText().toString();
            String password = signinpass.getText().toString();
            //checking the validity of the Email
            if(email.isEmpty())
            {

                signinemail.setError("Enter an email address"); //print message in email edit text
                signinemail.requestFocus(); //cursore is go error location
                return;
            }
            else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
            {

                signinemail.setError("Enter a valid email address"); //if not match the email validity
                signinemail.requestFocus(); //cursore is go error location
                return;
            }

            //checking the validity of the password
            else if(password.isEmpty())  //if given empty pass then show error
            {

                signinpass.setError("Enter a password");
                signinpass.requestFocus();
                return;
            }

            else if(password.length() < 6 ) //if password length is less then 6
            {

                signinpass.setError("Minimum length 6");
                signinpass.requestFocus();
                return;
            }
            else {
                progressBar.setVisibility(View.VISIBLE);

            }

            userSignin(email,password);




        }


    }

    private void userSignin(String email, String password) {


        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {

                    Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Signin.this,Shopping.class);
                    startActivity(intent);
                    finish();


                }
                else
                {
                    Toast.makeText(getApplicationContext(),"password or email not match",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.INVISIBLE);

                }


            }
        });
    }



}
