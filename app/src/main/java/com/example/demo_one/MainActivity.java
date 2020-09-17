package com.example.demo_one;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer= MediaPlayer.create(this,R.raw.woosh);
        Button button=(Button)findViewById(R.id.widget);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Intent i=new Intent(MainActivity.this,Widget.class);
                startActivity(i);
            }
        });
Button activityy=(Button)findViewById(R.id.activityy);
activityy.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i1=new Intent(MainActivity.this,Activity_one.class);
        startActivity(i1);
    }
});

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.icon1:
                Toast.makeText(this,"Icon1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.icon2:
                Toast.makeText(this,"Icon2 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.icon3:
                Toast.makeText(this,"Icon3 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.icon4:
                Toast.makeText(this,"Icon4 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this,"subitem1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this,"subitem2 selected",Toast.LENGTH_SHORT).show();
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }
}