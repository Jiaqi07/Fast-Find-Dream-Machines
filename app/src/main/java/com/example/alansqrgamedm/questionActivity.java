package com.example.alansqrgamedm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class questionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(questionActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray((R.array.names)));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(myAdapter1);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(questionActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray((R.array.difficulty)));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(myAdapter2);

        goToReady();

        configureBackButton();
    }
    private void configureBackButton() {
        ImageButton backButton = (ImageButton) findViewById((R.id.home));
        backButton.setOnClickListener(view -> finish());
    }

    private void goToReady() {
        Button nextButton = (Button) findViewById((R.id.goClue));
        nextButton.setOnClickListener(view -> startActivity(new Intent(questionActivity.this, ready.class)));
    }
}