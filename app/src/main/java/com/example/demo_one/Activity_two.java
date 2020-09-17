package com.example.demo_one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity_two extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.i("activity 1  status","A :Oncreate called");
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity 2  status","B :OnStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("activity 2  status","B :OnResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity 2  status","B :OnPause called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity 2  status","B :OnRestart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity 2  status","B :OnStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity 2  status","B :OnDestroy called");
    }
}
