package com.ugb.shestarrestaurant.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.ugb.shestarrestaurant.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);
    }

    public void registrarse(View view) {
        startActivity(new Intent(WelcomeActivity.this, RegistrationActivity2.class));
    }

    public void login(View view) {
        startActivity(new Intent(WelcomeActivity.this,RegistrationActivity2.class));
    }
}