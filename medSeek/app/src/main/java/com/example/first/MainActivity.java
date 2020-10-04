package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.sign_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });
    }

    public void signIn(){
        Intent i = (new Intent(this, SecondActivity.class));

        String unknown = "unknown";
        String message1;


        EditText editText = (EditText) findViewById(R.id.name_edit);
        if(editText.getText().toString().equals(""))
        {
            message1 = unknown;
        }
        else{
            message1 = editText.getText().toString();
        }

        Intent intent = i.putExtra("username", message1);
        startActivity(i);
    }
}
