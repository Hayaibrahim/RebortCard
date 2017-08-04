package com.example.android.rebortcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ReportCard h = new ReportCard("haya", 34567, "math", 80);
        System.out.println(h);
    }
}
