package com.example.cj.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Button1 = (Button) findViewById(R.id.button1);
        Button Button2 = (Button) findViewById(R.id.button2);
        Button Button3 = (Button) findViewById(R.id.button3);
        Button Button4 = (Button) findViewById(R.id.button4);
        Button Button5 = (Button) findViewById(R.id.button5);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "热门电影", Toast.LENGTH_SHORT).show();
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "股票雄鹰", Toast.LENGTH_SHORT).show();
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "XYZ阅读器", Toast.LENGTH_SHORT).show();
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "最新闻", Toast.LENGTH_SHORT).show();
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "毕业设计", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
