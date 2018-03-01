package com.drnserver.nuggettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weekly extends AppCompatActivity {
    private Button achievementsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly);
        achievementsButton = (Button) findViewById(R.id.achievementsButton);
        achievementsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(weekly.this,
                        Achievements.class);
                startActivity(myIntent);
            }
        });
    }
}
