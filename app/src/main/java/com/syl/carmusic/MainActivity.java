package com.syl.carmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    //admin ve 1234
    //kullanıcı adı ve şifre
    private Button registerbtn;
    String myusername ="admin";
    String mypassword ="1234";


    int count=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        Button registerbtn = (Button) findViewById(R.id.registerbtn);



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if(username.getText().toString().equals(myusername) && password.getText().toString().equals(mypassword)){
                //correct
                Toast.makeText(MainActivity.this, "Giriş Başarılı", Toast.LENGTH_SHORT ).show();
                openActivity2();

            }
            else{
                count--;
                Toast.makeText(MainActivity.this, "Kullanıcı Adı veya Şifre yanlış, " + count + " hakkınız kaldı", Toast.LENGTH_SHORT ).show();


                if(count==0){
                    //register ekranına geçiş
                    count=3;
                    Toast.makeText(MainActivity.this, "Üye ol ekranına yönlendiriliyorsunuz", Toast.LENGTH_SHORT ).show();
                    openActivity();
                }

            }

            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            openActivity();

            }
        });


    }

    public void openActivity() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);

    }
    public void openActivity2() {
        Intent intent = new Intent(this, MyMediaPlayer.class);
        startActivity(intent);

    }

}