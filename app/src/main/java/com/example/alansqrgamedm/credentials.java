package com.example.alansqrgamedm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class credentials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials);

        configureBackButton();
    }
    private void configureBackButton() {
        Button backButton = (Button) findViewById((R.id.goBackToStart));
        backButton.setOnClickListener(view -> finish());
    }
}