package com.drnserver.nuggettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Form extends AppCompatActivity {

    private Button submitButton;
    private EditText nuggetNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        nuggetNumber = (EditText) findViewById(R.id.nuggetNumber);
        submitButton = (Button) findViewById(R.id.submitButton);
        nuggetNumber.setText(Integer.toString(MainActivity.nuggetValue));
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Form.this,
                        weekly.class);
                startActivity(myIntent);
            }
        });
    }
}
