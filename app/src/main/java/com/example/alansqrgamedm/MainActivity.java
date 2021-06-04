package com.example.alansqrgamedm;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        goToTrivia2();
        goToTrivia();

    }
    private void goToTrivia() {
        Button nextButton = (Button) findViewById((R.id.goQ));
        nextButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, questionActivity.class)));
    }
    private void goToTrivia2() {
        Button nextButton = (Button) findViewById((R.id.goQ1));
        nextButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, questionActivity.class)));
    }
}