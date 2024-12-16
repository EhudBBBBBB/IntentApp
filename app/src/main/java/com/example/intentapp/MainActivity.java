package com.example.intentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button openBrowserButton = findViewById(R.id.openBrowserButton);
        Button makeCallButton = findViewById(R.id.makeCallButton);
        Button shareTextButton = findViewById(R.id.shareTextButton);

        openBrowserButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
            startActivity(intent);
        });
        makeCallButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"));
            startActivity(intent);
        });
        shareTextButton.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, ShareActivity.class);
            startActivity(intent);
        });
    }
    public void startActivity(Intent intent) {

    }
}

