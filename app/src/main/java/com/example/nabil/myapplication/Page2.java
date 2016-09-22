package com.example.nabil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
    private EditText addDevice;

    public void buttonOnClick(View v) {
        //do something when the button is clicked
        Button button = (Button) v;
        addDevice = (EditText) findViewById(R.id.Device);
        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP| Gravity.LEFT, 0 ,0);
       toast.makeText(Page2.this, addDevice.getText(),toast.LENGTH_SHORT).show();

    }
}


