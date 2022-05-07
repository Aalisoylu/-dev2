package com.syl.carmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password= (EditText) findViewById(R.id.password);
        EditText repassword= (EditText) findViewById(R.id.repassword);
        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);


        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(password.getText().toString().equals(repassword.getText().toString()) ){
                    Toast.makeText(RegisterActivity.this, "Kayıt işlemi gerçekleştirildi", Toast.LENGTH_SHORT ).show();
                }
                else {
                    Toast.makeText(RegisterActivity.this, "Şifreler eşleşmedi", Toast.LENGTH_SHORT ).show();

                }


            }
        });



    }
}


