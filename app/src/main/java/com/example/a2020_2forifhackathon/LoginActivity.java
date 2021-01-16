package com.example.a2020_2forifhackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    Button btnRegister;
    EditText idhere;
    EditText pwhere;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference colRef = db.collection("user");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        idhere = findViewById(R.id.ET_IdHere);
        pwhere = findViewById(R.id.ET_PwHere);

        btnLogin = findViewById(R.id.BTN_Login);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ID = idhere.getText().toString();
                String PW = pwhere.getText().toString();

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("userid", ID);
                startActivity(intent);
            }
        });

        btnRegister = findViewById(R.id.BTN_Register);
        btnRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });



    }
}