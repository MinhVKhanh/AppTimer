package com.example.smartwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
//                                            finish();
                    Intent i = new Intent(loginActivity.this, MainActivity2.class);
                    startActivity(i);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Your call has failed...",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}