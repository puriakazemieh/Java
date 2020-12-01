package com.kazemieh.www.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class Setting extends AppCompatActivity {

    RadioButton rb_system, rb_iran, rb_aviny;
    Button b_save, b_cancel;
    TextView tv_test;
    SeekBar sb_size, sb_line;

    Typeface font;
    String sfont;

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        rb_system = findViewById(R.id.rb_Setting_system);
        rb_iran = findViewById(R.id.rb_Setting_iran);
        rb_aviny = findViewById(R.id.rb_Setting_aviny);

        sb_size = findViewById(R.id.sb_Setting_size);
        sb_line = findViewById(R.id.sb_Setting_line);

        tv_test = findViewById(R.id.tv_Setting_test);

        b_save = findViewById(R.id.b_Setting_save);
        b_cancel = findViewById(R.id.b_Setting_cancel);

        Load();

        rb_iran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                font = Typeface.createFromAsset(getAssets(), "font/iran.ttf");
                sfont = "iran";
                tv_test.setTypeface(font);
            }
        });
        rb_aviny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                font = Typeface.createFromAsset(getAssets(), "font/aviny.ttf");
                sfont = "aviny";
                tv_test.setTypeface(font);
            }
        });
        rb_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_test.setTypeface(null);
                sfont = "system";
            }
        });

        sb_size.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_test.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb_line.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_test.setLineSpacing(progress, 1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        b_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sharedPreferences = getApplicationContext().getSharedPreferences("setting", 0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("font", sfont);
                editor.putInt("size", sb_size.getProgress());
                editor.putInt("space", sb_line.getProgress());
                editor.apply();
                editor.commit();

                finish();
                Intent intent=new Intent(Setting.this,Main.class);
                startActivity(intent);


            }
        });
        b_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent=new Intent(Setting.this,Main.class);
                startActivity(intent);
            }
        });

    }

    public void Load() {
        sharedPreferences = getApplicationContext().getSharedPreferences("setting", 0);

        //font
        String temp = sharedPreferences.getString("font", "system");
        if (temp.equals("system")) {
            tv_test.setTypeface(null);
            rb_system.setChecked(true);
        } else {

            if (temp.equals("iran")) {
                font = Typeface.createFromAsset(getAssets(), "font/"+temp+".ttf");
                tv_test.setTypeface(font);
                rb_iran.setChecked(true);
            } else if (temp.equals("aviny")) {
                font = Typeface.createFromAsset(getAssets(), "font/"+temp+".ttf");
                tv_test.setTypeface(font);
                rb_aviny.setChecked(true);
            }
        }

        //size
        int i_size=sharedPreferences.getInt("size",14);
        tv_test.setTextSize(i_size);
        sb_size.setProgress(i_size);

        int i_space=sharedPreferences.getInt("space",1);
        tv_test.setLineSpacing(i_space,1);
        sb_line.setProgress(i_space);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        Intent intent=new Intent(Setting.this,Main.class);
        startActivity(intent);
    }
}