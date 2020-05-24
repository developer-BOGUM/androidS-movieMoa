package com.example.moviem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    ImageButton btn6;
    ImageButton btn7;
    ImageButton btn8;

    ImageButton mv1;
    ImageButton mv2;
    ImageButton mv3;
    ImageButton mv4;
    ImageButton mv5;
    ImageButton mv6;

    @SuppressLint({"WrongConstant", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.appbar_layout);

        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(this);

        btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(this);

        btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(this);

        btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(this);

        btn8 = findViewById(R.id.button8);
        btn8.setOnClickListener(this);

        mv1 = findViewById(R.id.movie1);
        mv1.setOnClickListener(this);

        mv2 = findViewById(R.id.movie2);
        mv2.setOnClickListener(this);

        mv3 = findViewById(R.id.movie3);
        mv3.setOnClickListener(this);

        mv4 = findViewById(R.id.movie4);
        mv4.setOnClickListener(this);

        mv5 = findViewById(R.id.movie5);
        mv5.setOnClickListener(this);

        mv6 = findViewById(R.id.movie6);
        mv6.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            Toast.makeText(MainActivity.this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button2) {
            Toast.makeText(MainActivity.this, "아이디와 패스워드가 올바르지 않습니다.", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button3) {
            Toast.makeText(MainActivity.this, "아이디와 패스워드가 올바르지 않습니다.", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button4) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_slide_in_top, R.anim.anim_slide_out_bottom);
        }
        else if (view.getId() == R.id.button5) {
        }
        else if (view.getId() == R.id.button6) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_slide_in_top, R.anim.anim_slide_out_bottom);
        }
        else if (view.getId() == R.id.button7) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_slide_in_top, R.anim.anim_slide_out_bottom);
        }
        else if (view.getId() == R.id.button8) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_slide_in_top, R.anim.anim_slide_out_bottom);

    }
    }

}


