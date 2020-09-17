package com.example.demo_one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class Splash extends Activity {
    ImageView wel1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        wel1=findViewById(R.id.wel1);
        wel1.animate().rotationBy(360).scaleXBy(0.5f).scaleYBy(0.5f).setDuration(2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Splash.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        },3000);

    }
}
