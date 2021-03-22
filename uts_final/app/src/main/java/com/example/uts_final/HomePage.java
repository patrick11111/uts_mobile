package com.example.uts_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button profil;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        this.setTitle("HomePage");

        profil = findViewById(R.id.button);
        login = findViewById(R.id.button2);

        profil.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this,  Profile.class);
            startActivity(intent);

        });

        login.setOnClickListener(v -> {
            Intent INtent = new Intent(HomePage.this,  Login.class);
            startActivity(INtent);

        });
    }
}