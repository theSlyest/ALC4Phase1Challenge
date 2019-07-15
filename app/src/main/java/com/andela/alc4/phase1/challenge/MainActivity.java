package com.andela.alc4.phase1.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbout;
    private Button buttonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbout = findViewById(R.id.buttonAbout);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = MainActivity.this;

                Class aboutActivity = AboutActivity.class;
                Intent startAboutActivity = new Intent(context, aboutActivity);

                startActivity(startAboutActivity);

            }
        });

        buttonProfile = findViewById(R.id.buttonProfile);
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = MainActivity.this;

                Class profileActivity = ProfileActivity.class;
                Intent startProfileActivity = new Intent(context, profileActivity);

                startActivity(startProfileActivity);

            }
        });
    }
}
