package com.kazemieh.www.java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    public static Typeface font;
    public  static int size;
    public static int space;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadSetting();

        ImageView iv_setting=findViewById(R.id.iv_Main_setting);
        iv_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main.this,Setting.class);
                startActivity(intent);
                finish();
            }
        });

        RecyclerView recyclerView=findViewById(R.id.rv_Main_showmainlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));

        AdapterMain adapter=new AdapterMain(this,dataModelList());
        recyclerView.setAdapter(adapter);
    }
    public List<DataModel> dataModelList(){
        List<DataModel> dataModels=new ArrayList<>();
        dataModels.add(new DataModel(R.drawable.ic_one,"جاوا مقدماتی"));
  //      dataModels.add(new DataModel(R.drawable.ic_two,"جاوا پیشرفته"));
        return dataModels;
    }

    public void LoadSetting(){
        SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("setting",0);
        String sfont=sharedPreferences.getString("font","iran");
        font=Typeface.createFromAsset(getAssets(),"font/"+sfont+".ttf");
        size=sharedPreferences.getInt("size",14);
        space=sharedPreferences.getInt("space",1);

    }



}