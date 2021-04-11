package com.example.alansqrgamedm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class shopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        configureBackButton();
    }
    private void configureBackButton() {
        Button backButton = (Button) findViewById((R.id.goBackStart));
        backButton.setOnClickListener(view -> finish());
    }
}