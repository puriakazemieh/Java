package com.kazemieh.www.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class JavaMoqadqmqti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javamoqadqmqti);
        RecyclerView recyclerView = findViewById(R.id.rv_MainActivity_showlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false));
        TextView textView = findViewById(R.id.tv_Java_Title);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String temp = bundle.getString("matn");
            if (temp.equals("جاوا مقدماتی")) {
                textView.setText("Java Moqadqmqti");

                Adapter adapter = new Adapter(this, dataModelList());
                recyclerView.setAdapter(adapter);
            } else if (temp.equals("جاوا پیشرفته")) {

                textView.setText("Java pishrafte");

                Adapter adapter = new Adapter(this, dataModels());
                recyclerView.setAdapter(adapter);
            }
        }


    }

    public List<DataModel> dataModelList() {
        List<DataModel> dataModels = new ArrayList<>();
        dataModels.add(new DataModel("فصل اول", R.drawable.ic_one));
        dataModels.add(new DataModel("فصل دوم", R.drawable.ic_two));
        dataModels.add(new DataModel("فصل سوم", R.drawable.ic_three));
        dataModels.add(new DataModel("فصل چهارم", R.drawable.ic_four));
        dataModels.add(new DataModel("فصل پنحم", R.drawable.ic_five));
        dataModels.add(new DataModel("فصل ششم", R.drawable.ic_six));
        dataModels.add(new DataModel("فصل هفتم", R.drawable.ic_seven));
        dataModels.add(new DataModel("فصل هشتم", R.drawable.ic_eight));
        dataModels.add(new DataModel("فصل نهم", R.drawable.ic_nine));
        dataModels.add(new DataModel("فصل دهم", R.drawable.ic_ten));
        return dataModels;
    }

    public List<DataModel> dataModels() {
        List<DataModel> dataModels = new ArrayList<>();
        dataModels.add(new DataModel("فصل اول پیشرفته", R.drawable.ic_one));
        dataModels.add(new DataModel("فصل دوم پیشرفته", R.drawable.ic_two));
        dataModels.add(new DataModel("فصل سوم پیشرفته", R.drawable.ic_three));
        dataModels.add(new DataModel("فصل چهارم پیشرفته", R.drawable.ic_four));
        dataModels.add(new DataModel("فصل پنجم پیشرفته", R.drawable.ic_five));
        dataModels.add(new DataModel("فصل ششم پیشرفته", R.drawable.ic_six));
        return dataModels;
    }
}