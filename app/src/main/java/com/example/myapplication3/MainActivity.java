package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mytext = (TextView) findViewById(R.id.mytext);
        String str="";

        for(int i=1;i<=100;i++)
        {
            str+= i +"\n";
        }
        mytext.setText("Taufik");

        mytext.setText(str);

    }
}
