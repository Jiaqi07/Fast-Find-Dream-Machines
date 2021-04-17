package com.example.alansqrgamedm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.*;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia);

        int index = 0;

        TextView questions = (TextView) findViewById((R.id.question));
        ImageView wrong = (ImageView) findViewById((R.id.wrong));
        ImageView correct = (ImageView) findViewById((R.id.correct));
        EditText answers = (EditText) findViewById((R.id.answer));

        ArrayList<Item> questionsText = new ArrayList<>();
        for(int i = 0; i < Database.questions.length; ++i){
            questionsText.add(new Item(Database.questions[i], Database.answers[i]));
        }

        Collections.shuffle(questionsText);

        correct.setVisibility(View.INVISIBLE);
        wrong.setVisibility(View.INVISIBLE);
        questions.setText(questionsText.get(index).getQuestion());

        answers.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(answers.getText().toString().equalsIgnoreCase(questionsText.get(index).getAnswer())){
                    wrong.setVisibility(View.INVISIBLE);
                    correct.setVisibility(View.VISIBLE);
                }
                else{
                    correct.setVisibility(View.INVISIBLE);
                    wrong.setVisibility(View.VISIBLE);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        configureBackButton();
    }
    private void configureBackButton() {
        Button backButton = (Button) findViewById((R.id.goBackStart2));
        backButton.setOnClickListener(view -> finish());
    }
}