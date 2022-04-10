package com.example.btl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Textview btn=findViewById(R.id.textViewSignUp);
        btn.setOnClickListener(new View.OnclickListener() {
            aoverride
            public void onclick(View v) {
                startActivity(new Intent( packageContert: LoginActivity.this, RegisterActivity.class));
            };

    }
}
