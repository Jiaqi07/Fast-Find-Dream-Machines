package com.example.alansqrgamedm;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;


public class clue extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clue);

        goToScan();
        goToMaps();
        configureBackButton();
    }

    private void goToScan() {
        Button nextButton = (Button) findViewById((R.id.Next));
        nextButton.setOnClickListener(view -> startActivity(new Intent(clue.this, startActivity.class)));
    }
    private void goToMaps() {
        Button nextButton = (Button) findViewById((R.id.maps));
        nextButton.setOnClickListener(view -> startActivity(new Intent(clue.this, MapsActivity.class)));
    }
    private void configureBackButton() {
        ImageButton backButton = (ImageButton) findViewById((R.id.home3));
        backButton.setOnClickListener(view -> startActivity(new Intent(clue.this, MainActivity.class)));
    }
}
