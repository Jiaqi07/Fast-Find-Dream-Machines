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

        goToShop();
        goToScan();
        goToLogin();
        goToTrivia();
        goToMap();
    }

    private void goToLogin() {
        Button nextButton = (Button) findViewById((R.id.logIn));
        nextButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, credentials.class)));
    }
    private void goToShop() {
        Button nextButton = (Button) findViewById((R.id.shopButton));
        nextButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, shopActivity.class)));
    }
    private void goToScan() {
        Button nextButton = (Button) findViewById((R.id.nextButton));
        nextButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, startActivity.class)));
    }
    private void goToTrivia() {
        Button nextButton = (Button) findViewById((R.id.goTrivia));
        nextButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, TriviaActivity.class)));
    }
    private void goToMap() {
        Button nextButton = (Button) findViewById((R.id.goMaps));
        nextButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MapActivity.class)));
    }
}