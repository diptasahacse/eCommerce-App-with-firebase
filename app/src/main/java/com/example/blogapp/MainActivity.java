package com.example.blogapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText fullname,emailid,pass,conpass;
    private Button register;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullname = findViewById(R.id.signupnameid);
        emailid = findViewById(R.id.signupemailid);
        pass = findViewById(R.id.signuppassid);
        conpass = findViewById(R.id.signupconpassid);
        register = findViewById(R.id.signupregisterbutonid);
        progressBar = findViewById(R.id.progressbarid);

        progressBar.setVisibility(View.INVISIBLE);

        mAuth = FirebaseAuth.getInstance();

        register.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.signupregisterbutonid)
        {
            progressBar.setVisibility(View.VISIBLE);

            String nam = fullname.getText().toString();
            String email = emailid.getText().toString();
            String password = pass.getText().toString();
            String conp = conpass.getText().toString();


            //checking the validity of the name
            if(nam.isEmpty())  //if given empty pass then show error
            {
                progressBar.setVisibility(View.INVISIBLE);
                fullname.setError("Name is Required");
                fullname.requestFocus();
                return;
            }
            //checking the validity of the Email
            else if(email.isEmpty())
            {
                progressBar.setVisibility(View.INVISIBLE);
                emailid.setError("Enter an email address"); //print message in email edit text
                emailid.requestFocus(); //cursore is go error location
                return;
            }
            else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
            {
                progressBar.setVisibility(View.INVISIBLE);
                emailid.setError("Enter a valid email address"); //if not match the email validity
                emailid.requestFocus(); //cursore is go error location
                return;
            }

            //checking the validity of the password
            else if(password.isEmpty())  //if given empty pass then show error
            {
                progressBar.setVisibility(View.INVISIBLE);
                pass.setError("Enter a password");
                pass.requestFocus();
                return;
            }

            else if(password.length() < 6 || !(password.equals(conp))) //if password length is less then 6
            {
                progressBar.setVisibility(View.INVISIBLE);
                pass.setError("Minimum length 6 and both pass should same");
                pass.requestFocus();
                return;
            }
            else
            {
                registerOption(nam,email,password);
            }




        }


    }

    private void registerOption(String nam, String email, String password) {

        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {

                    Toast.makeText(getApplicationContext(),"Successfully Register",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.INVISIBLE);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Unsuccessfully Register or Already Registered",Toast.LENGTH_LONG).show();

                    progressBar.setVisibility(View.INVISIBLE);
                }



            }
        });



    }


}
