package com.example.martin.projekt1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Martin on 2016.12.12..
 */

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final EditText userName =(EditText) findViewById(R.id.etNewName);
        final EditText password =(EditText) findViewById(R.id.etNewPassword);
        final EditText email =(EditText) findViewById(R.id.etNewEmail);
        Button btnRegister=(Button) findViewById(R.id.btnRegister); // lehet hogy itt hibád dob...

        btnRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View V){

                SharedPreferences preferences = getSharedPreferences("MYPRESS", MODE_PRIVATE);
                String newUser =userName.getText().toString();
                String newPassword =password.getText().toString();
                String newEmail =email.getText().toString();

                SharedPreferences.Editor editor=preferences.edit();
                editor.putString(newUser+newPassword+"data", newUser+ "\n"+newEmail);
                editor.commit();


                Intent loginScreen =new Intent(Register.this, MainActivity.class);
                startActivity(loginScreen);
        }
    });

    }
}
