package com.example.nabil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View v){
        //Button AddDevice=(Button) v;
        //((Button) v).setText("clicked");
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);

    }

    public void buttonOnClick2(View v){
        //Button AddDevice=(Button) v;
        //((Button) v).setText("clicked");
        Intent intent = new Intent(this, page3.class);
        startActivity(intent);

    }
}
