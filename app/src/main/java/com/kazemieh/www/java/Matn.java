package com.kazemieh.www.java;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Matn extends AppCompatActivity {
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matn);
        TextView matn1 = findViewById(R.id.tv_Matn_matn1);
        TextView matn2 = findViewById(R.id.tv_Matn_matn2);
        TextView matn3 = findViewById(R.id.tv_Matn_matn3);
        TextView matn4 = findViewById(R.id.tv_Matn_matn4);
        VideoView videoView = findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        matn1.setTypeface(Main.font);
        matn1.setTextSize(Main.size);
        matn1.setLineSpacing(Main.space, 1);

        matn2.setTypeface(Main.font);
        matn2.setTextSize(Main.size);
        matn2.setLineSpacing(Main.space, 1);

        matn3.setTypeface(Main.font);
        matn3.setTextSize(Main.size);
        matn3.setLineSpacing(Main.space, 1);

        matn4.setTypeface(Main.font);
        matn4.setTextSize(Main.size);
        matn4.setLineSpacing(Main.space, 1);

        ImageView image1 = findViewById(R.id.iv_Matn_image1);
        ImageView image2 = findViewById(R.id.iv_Matn_image2);
        ImageView image3 = findViewById(R.id.iv_Matn_image3);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String temp = bundle.getString("matn");
            if (temp.equals("فصل اول")) {

       //         uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam01);


                matn1.setText(getText(R.string.f1m1).toString());

                image1.setImageResource(R.drawable.slide2);

                matn2.setText(getText(R.string.f1m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide3);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f1m3).toString());

            }
            else if (temp.equals("فصل دوم")) {
              //  uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam02);

                matn1.setText(getText(R.string.f2m1).toString());

                image1.setImageResource(R.drawable.slide4);

                matn2.setText(getText(R.string.f2m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide5);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f2m3).toString());

            }
            else if (temp.equals("فصل سوم")) {
          //      uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam03);

                matn1.setText(getText(R.string.f3m1).toString());

                image1.setImageResource(R.drawable.slide6);

                matn2.setText(getText(R.string.f3m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide7);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f3m3).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide8);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f3m4).toString());
            }
            else if (temp.equals("فصل چهارم")) {
           //     uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam04);

                matn1.setText(getText(R.string.f4m1).toString());

                image1.setImageResource(R.drawable.slide9);

                matn2.setText(getText(R.string.f4m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide10);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f4m3).toString());

            }
            else if (temp.equals("فصل پنحم")) {
             //   uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam05);

                matn1.setText(getText(R.string.f5m1).toString());

                image1.setImageResource(R.drawable.slide11);

                matn2.setText(getText(R.string.f5m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide12);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f5m3).toString());

                image3.setVisibility(View.VISIBLE);
                image3.setImageResource(R.drawable.slide13);

            }
            else if (temp.equals("فصل ششم")) {
           //     uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam06);

                matn1.setText(getText(R.string.f6m1).toString());

                image1.setImageResource(R.drawable.slide14);

                matn2.setText(getText(R.string.f6m2).toString());

            }
            else if (temp.equals("فصل هفتم")) {
            //    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam07);

                matn1.setText(getText(R.string.f7m1).toString());

                image1.setImageResource(R.drawable.slide15);

                matn2.setText(getText(R.string.f7m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide161);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f7m3).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide162);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f7m4).toString());
            }
            else if (temp.equals("فصل هشتم")) {
           //     uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam08);

                matn1.setText(getText(R.string.f8m1).toString());

                image1.setImageResource(R.drawable.slide17);

                matn2.setText(getText(R.string.f8m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide18);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f8m3).toString());

            }
            else if (temp.equals("فصل نهم")) {
           //     uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam09);

                matn1.setText(getText(R.string.f9m1).toString());

                image1.setImageResource(R.drawable.slide190);

                matn2.setText(getText(R.string.f9m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide19);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f9m3).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide20);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f9m4).toString());
            }
            else if (temp.equals("فصل دهم")) {
         //       uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javam10);

                matn1.setText(getText(R.string.f10m1).toString());

                image1.setImageResource(R.drawable.slide21);

                matn2.setText(getText(R.string.f10m2).toString());

                image2.setVisibility(View.VISIBLE);
                image2.setImageResource(R.drawable.slide22);

                matn3.setVisibility(View.VISIBLE);
                matn3.setText(getText(R.string.f10m3).toString());

            }
   /*         else if (temp.equals("فصل اول پیشرفته")) {
                uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javap01);
                matn1.setVisibility(View.GONE);
                matn2.setVisibility(View.GONE);
            } else if (temp.equals("فصل دوم پیشرفته")) {
                uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javap02);
                matn1.setVisibility(View.GONE);
                matn2.setVisibility(View.GONE);
            } else if (temp.equals("فصل سوم پیشرفته")) {
                uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javap03);
                matn1.setVisibility(View.GONE);
                matn2.setVisibility(View.GONE);
            } else if (temp.equals("فصل چهارم پیشرفته")) {
                uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javap04);
                matn1.setVisibility(View.GONE);
                matn2.setVisibility(View.GONE);
            } else if (temp.equals("فصل پنجم پیشرفته")) {
                uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javap05);
                matn1.setVisibility(View.GONE);
                matn2.setVisibility(View.GONE);
            } else if (temp.equals("فصل ششم پیشرفته")) {
                uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.javap06);
                matn1.setVisibility(View.GONE);
                matn2.setVisibility(View.GONE);
            }*/
        }

        videoView.setVideoURI(uri);
    }
}