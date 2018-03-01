package com.drnserver.nuggettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int nuggetValue = 0;
    private TextView nuggetCounter;
    private ImageButton nuggetButton;
    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nuggetCounter = (TextView) findViewById(R.id.counterText);
        nuggetButton = (ImageButton) findViewById(R.id.nuggetButton);
        submitButton = (Button) findViewById(R.id.mainSubmit);

        nuggetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nuggetValue = nuggetValue +1;
                nuggetCounter.setText(Integer.toString(nuggetValue));
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Form.class);
                startActivity(myIntent);
            }
        });

    }
}
