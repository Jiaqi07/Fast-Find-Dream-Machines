package com.example.alansqrgamedm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        configureBackButton();
    }
    private void configureBackButton() {
        Button backButton = (Button) findViewById((R.id.goBackStart4));
        backButton.setOnClickListener(view -> finish());
    }
}