package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent intent = getIntent();
        String message = intent.getStringExtra("username");
        TextView textUsername = findViewById(R.id.put_username);
        textUsername.setText(message);

        final Button button = findViewById(R.id.hastane_bul);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMaps(); }
        });
    }

    public void goToMaps(){
        Intent i = (new Intent(this, ThirdActivity.class));
        startActivity(i);
    }
}