package com.example.zar.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard reportCard=new ReportCard(67,87,83,87,88,"Zar Saeed",284);
        TextView textView= (TextView) findViewById(R.id.text);

        textView.setText(""+reportCard.displayResult());

    }
}
