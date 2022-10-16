package com.example.hazi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginToForm(View v) {

        EditText email = findViewById(R.id.emailET);
        EditText password = findViewById(R.id.passwordET);
        if(email.getText().toString().equals("admin") && password.getText().toString().equals("123")) {
            Intent myIntent = new Intent(this, newProductActivity.class);
            startActivity(myIntent);
            return;
        }
        Toast.makeText(this, "Wrong username / password (try admin and 123 ;) )", Toast.LENGTH_SHORT).show();

    }
}