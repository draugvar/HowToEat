package com.example.draug.howtoeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void clickLogin(View view){
        EditText textEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText textPassword = (EditText) findViewById(R.id.editTextPassword);


    }
}
