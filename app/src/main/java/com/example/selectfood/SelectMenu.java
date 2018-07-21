package com.example.selectfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SelectMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_menu);


        ImageButton korea, china, japan,west,night,achol;
        korea = (ImageButton) findViewById(R.id.imageButton);
        china = (ImageButton) findViewById(R.id.imageButton3);
        japan = (ImageButton) findViewById(R.id.imageButton5);
        west = (ImageButton) findViewById(R.id.imageButton4);
        night = (ImageButton) findViewById(R.id.imageButton6);
        achol = (ImageButton) findViewById(R.id.imageButton7);


        korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),Korea.class);
                intent.putExtra("count",1);
                startActivity(intent);
            }
        });
        china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),Korea.class);
                intent.putExtra("count",2);
                startActivity(intent);
            }
        });
        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),Korea.class);
                intent.putExtra("count",3);
                startActivity(intent);
            }
        });
        west.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),Korea.class);
                intent.putExtra("count",4);
                startActivity(intent);
            }
        });
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),Korea.class);
                intent.putExtra("count",5);
                startActivity(intent);
            }
        });
        achol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),Korea.class);
                intent.putExtra("count",6);
                startActivity(intent);
            }
        });
    }
}
