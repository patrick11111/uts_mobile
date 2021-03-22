package com.example.uts_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button LogiN;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Login");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        LogiN = (Button) findViewById(R.id.btnLogin);

        LogiN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString() , Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword)
    {
        if((userName.equals("utsmobile")) && (userPassword.equals("utsmobilgenap")))
        {
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
        }
        else
        {
            counter--;
            if(counter == 0)
            {
                LogiN.setEnabled(false);
            }
        }
    }
}