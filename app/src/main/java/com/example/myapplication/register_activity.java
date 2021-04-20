package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class register_activity extends AppCompatActivity {

    EditText  email, password;
    Button register;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activity);


        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        fAuth = FirebaseAuth.getInstance();


    }

    public void register(View view) {

        String user_email = email.getText().toString();
        String user_password = password.getText().toString();

        fAuth.createUserWithEmailAndPassword(user_email, user_password).addOnCompleteListener(task -> {

            if (task.isSuccessful()) {
                Toast.makeText(getApplicationContext(), "User has been created", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            } else {
                Toast.makeText(getApplicationContext(), "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}