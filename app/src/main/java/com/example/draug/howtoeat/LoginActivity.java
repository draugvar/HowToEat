package com.example.draug.howtoeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void clickLogin(View view){
        EditText textEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText textPassword = (EditText) findViewById(R.id.editTextPassword);

        if( (textEmail.getText().toString().equals("")) || (textPassword.getText().toString().equals(""))){
            Toast.makeText(getApplicationContext(), "Inserire email e password!", Toast.LENGTH_SHORT).show();
        } else {

        }
    }
}
