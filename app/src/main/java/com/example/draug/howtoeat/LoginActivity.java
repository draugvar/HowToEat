package com.example.draug.howtoeat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void buttonLogin(View view){
        String textEmail = ((EditText) findViewById(R.id.editTextEmail)).getText().toString();
        String textPassword = ((EditText) findViewById(R.id.editTextPassword)).getText().toString();
        Context context = getApplicationContext();

        if( (textEmail.equals("")) || (textPassword.equals("")) ){
            Toast.makeText(context, "Inserire email e password!", Toast.LENGTH_SHORT).show();
        } else {
            SharedPreferences sharedPref = context.getSharedPreferences(HomeActivity.PREFERENCES, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString(User.EMAIL, textEmail);
            editor.putString(User.PASSWORD, textPassword);
            editor.apply();
            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(i);
        }
    }
    public void buttonFb(View view){
        Context context = getApplicationContext();
        SharedPreferences sharedPref = context.getSharedPreferences(HomeActivity.PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(User.NAME, "Dante");
        editor.putString(User.EMAIL, "ciao@email.com");
        editor.putString(User.PASSWORD, "caos");
        editor.apply();
        Intent i = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(i);
    }
}
