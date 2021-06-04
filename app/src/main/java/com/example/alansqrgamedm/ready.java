package com.example.alansqrgamedm;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;


public class ready extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready);

        goToClue();
        configureBackButton();
    }

    private void goToClue() {
        Button nextButton = (Button) findViewById((R.id.maps));
        nextButton.setOnClickListener(view -> startActivity(new Intent(ready.this, clue.class)));
    }
    private void configureBackButton() {
        ImageButton backButton = (ImageButton) findViewById((R.id.home2));
        backButton.setOnClickListener(view -> startActivity(new Intent(ready.this, MainActivity.class)));
    }
}
