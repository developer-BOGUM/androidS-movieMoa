package com.example.moviem;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;



public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    ToggleButton tb1;
    ToggleButton tb2;

    @SuppressLint({"WrongConstant", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tb1 = findViewById(R.id.toggle1);
        tb1.setOnClickListener(this);

        tb2 = findViewById(R.id.toggle2);
        tb2.setOnClickListener(this);


    }

    public void onClick(View view) {
        if (view.getId() == R.id.toggle1) {
            if (tb1.isChecked()) {
                tb1.setBackgroundDrawable(getResources().getDrawable(R.drawable.idoff));
            } else {
                tb1.setBackgroundDrawable(getResources().getDrawable(R.drawable.idon));
            }
        } else if (view.getId() == R.id.toggle2) {
            if (tb2.isChecked()) {
                tb2.setBackgroundDrawable(getResources().getDrawable(R.drawable.logoff));
            } else {
                tb2.setBackgroundDrawable(getResources().getDrawable(R.drawable.logon));
            }
        }
    }
}

