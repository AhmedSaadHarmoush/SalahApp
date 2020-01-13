package com.example.android.salah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LogActivity extends AppCompatActivity {

    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_activity);
    }

    public void Login(View view) {
        name = (EditText) findViewById(R.id.user);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void signup(View view){
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }

}
