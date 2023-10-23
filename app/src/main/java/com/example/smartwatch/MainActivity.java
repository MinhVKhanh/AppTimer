package com.example.smartwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

//    DatabaseReference mData;
    Button on;
    Button off;
    Button timer;
    Button alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//        myRef.setValue("Hello, World!");

//        mData = FirebaseDatabase.getInstance().getReference();
//        mData.child("ho ten").setValue("Vu Minh Khanh");

        on = (Button) findViewById(R.id.on);
        off = (Button) findViewById(R.id.off);
        timer = findViewById(R.id.btn_timer);
        alarm = findViewById(R.id.btn_alarm);
        on.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS");
                myRef.setValue(1);
//                FirebaseDatabase mRefChild = mRef.child("LED Status");
//                mRefChild.setValue(1);
            }
        });
        off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("LED_STATUS");
                myRef.setValue(0);
            }
        });
        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
//                                            finish();
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Your call has failed...",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
//                                            finish();
                    Intent i = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(i);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Your call has failed...",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}