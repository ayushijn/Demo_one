package com.example.demo_one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity_one extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.i("activity 1  status","A :Oncreate called");
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Activity_one.this,Activity_two.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity 1  status","A :OnStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("activity 1  status","A :OnResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity 1  status","A :OnPause called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity 1  status","A :OnRestart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity 1  status","A :OnStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity 1  status","A :OnDestroy called");
    }
}
