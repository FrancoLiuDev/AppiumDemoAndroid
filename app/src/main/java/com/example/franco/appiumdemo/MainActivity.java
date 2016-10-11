package com.example.franco.appiumdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LoginActivity loginActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        _loginButton = (Button) findViewById(R.id.login_button);

        _loginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.equals(_loginButton)){
            nevigateToLoginPage();
        }
        switch (v.getId()) {

        }

    }


    public void nevigateToLoginPage(){

       // Intent intent=new Intent();
        loginActivity=new LoginActivity();
        Intent myIntent = new Intent(MainActivity.this,loginActivity.getClass());
        startActivity(myIntent);
    }

    private Button _loginButton;
}
