package com.example.satay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username= (TextView)findViewById(R.id.Username);
        TextView password=(TextView) findViewById(R.id.passwordL);
        TextView registerText=(TextView)findViewById(R.id.registerText);
        MaterialButton loginbtn= (MaterialButton)findViewById(R.id.btnlogin);
        MaterialButton registerbtn=(MaterialButton)findViewById(R.id.RegisterBtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                    Toast.makeText(MainActivity.this, "Login Sucessful", Toast.LENGTH_SHORT).show();


        }
        });
       registerbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Register.class);
               startActivity(intent);
           }
       });


    }
}