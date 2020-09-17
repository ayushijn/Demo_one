package com.example.demo_one;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Recycler_view_example extends Activity {
    String[] s1,s2;
    int images[]={R.drawable.c_icon,R.drawable.cplus_icon,R.drawable.java_icon,R.drawable.sql_icon,R.drawable.chash_icon,R.drawable.python_icon,R.drawable.javascript_icon,R.drawable.php_icon,R.drawable.objc_icon,R.drawable.ruby_icon,R.drawable.html_icon,R.drawable.css_icon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_example);
        s1=getResources().getStringArray(R.array.languages);
        s2=getResources().getStringArray(R.array.Description);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        MyAdapter adapter=new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
}
}
