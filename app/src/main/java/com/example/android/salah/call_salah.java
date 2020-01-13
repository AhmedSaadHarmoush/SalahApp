package com.example.android.salah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class call_salah extends AppCompatActivity {
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_salah);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Spinner down = (Spinner) findViewById(R.id.spinner);
        String[] jobs = {"Plumber", "Carpenter ", "Smith "};
        String[] places ={"Your Position","Enter Position" , "Wait For Our Call"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.spinner,
                R.id.spinner_item,
                jobs);
        down.setAdapter(adapter);
        Spinner down2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                R.layout.spinner,
                R.id.spinner_item,
                places);
        down2.setAdapter(adapter2);
    }
    public void done(View view) {
        Toast.makeText(this, "You make a call", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
