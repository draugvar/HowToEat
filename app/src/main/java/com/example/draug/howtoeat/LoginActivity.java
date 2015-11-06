package com.example.draug.howtoeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class LoginActivity extends Activity {
    private User user;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        User mUser = User.getIstance();
        mUser.setEmail("DEFAULT");
        realm = Realm.getInstance(this);
        realm.beginTransaction();
        realm.allObjects(User.class).clear();
        user = realm.copyToRealm(mUser);
        realm.commitTransaction();
    }
    public void buttonLogin(View view){
        String textEmail = ((EditText) findViewById(R.id.editTextEmail)).getText().toString();
        String textPassword = ((EditText) findViewById(R.id.editTextPassword)).getText().toString();

        if( (textEmail.equals("")) || (textPassword.equals("")) ){
            Toast.makeText(getApplicationContext(), "Inserire email e password!", Toast.LENGTH_SHORT).show();
        } else {
            realm.beginTransaction();
            user.setEmail(textEmail);
            user.setPassword(textPassword);
            realm.commitTransaction();
            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(i);
        }
    }
    public void buttonFb(View view) {
        realm.beginTransaction();
        user.setEmail("ciao@gmail.com");
        user.setName("Dante");
        user.setPassword("yolooloy");
        realm.commitTransaction();
        Intent i = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(i);
    }
}
