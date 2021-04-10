package com.example.alansqrgamedm;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        goToShop();
        goToScan();
    }

    private void goToShop() {
        Button nextButton = (Button) findViewById((R.id.shopButton));
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, shopActivity.class));
            }
        });
    }
    private void goToScan() {
        Button nextButton = (Button) findViewById((R.id.nextButton));
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, startActivity.class));
            }
        });
    }
}