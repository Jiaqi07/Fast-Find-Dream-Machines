package com.example.alansqrgamedm;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;


public class locationfound extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locationfound);

        goToTrivia();
        configureBackButton();
    }

    private void goToTrivia() {
        Button nextButton = (Button) findViewById((R.id.Next));
        nextButton.setOnClickListener(view -> startActivity(new Intent(locationfound.this, TriviaActivity.class)));
    }
    private void configureBackButton() {
        ImageButton backButton = (ImageButton) findViewById((R.id.home4));
        backButton.setOnClickListener(view -> startActivity(new Intent(locationfound.this, MainActivity.class)));
    }
}
