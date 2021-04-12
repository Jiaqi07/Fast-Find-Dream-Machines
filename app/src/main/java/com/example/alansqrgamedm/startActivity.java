package com.example.alansqrgamedm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;

public class startActivity extends AppCompatActivity {
    private CodeScanner mCodeScanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureBackButton();

        CodeScannerView scannerView = findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(this, scannerView);
        mCodeScanner.setDecodeCallback(result -> {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(startActivity.this, result.getText(), Toast.LENGTH_SHORT).show();
                    Button reScanButton = (Button) findViewById(R.id.rescan);
                    char keychar = '^';//Symbol of the day
                    char[] ca = result.getText().toCharArray();
                    for(int i = 0; i < ca.length; ++i){
                        if(ca[i] == '^'){
                            Toast.makeText(startActivity.this, "Congrats, Points Have Been Added To Your Account!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    reScanButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            onResume();
                        }
                    });
                    onPause();
                }
            });
        });
        scannerView.setOnClickListener(view -> mCodeScanner.startPreview());
    }

    private void configureBackButton() {
        Button backButton = (Button) findViewById((R.id.backButton));
        backButton.setOnClickListener(view -> finish());
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCodeScanner.startPreview();
    }

    @Override
    protected void onPause() {
        mCodeScanner.releaseResources();
        super.onPause();
    }
}