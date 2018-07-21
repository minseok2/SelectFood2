package com.example.selectfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton sub1,sub2;
    Button but1,but2;
    TextView textView;
    int i=1;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent in = getIntent();
        i = in.getIntExtra("i",1);
        name = in.getStringExtra("userName");

        textView = (TextView)findViewById(R.id.textView14);
        sub1 = (ImageButton)findViewById(R.id.imageButton1);
        sub2 = (ImageButton)findViewById(R.id.imageButton2);

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),SelectMenu.class);
                startActivity(intent);

            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),SelectCount.class);
                startActivity(intent);
            }
        });

        but1 = (Button) findViewById(R.id.button8);
        but2 = (Button) findViewById(R.id.button7);

        if(i==0){
            textView.setText(name+"님    ");
            but1.setText("로그아웃");
            but2.setVisibility(View.INVISIBLE);

            but1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i = 1;
                    Intent intent = new Intent(getApplication(), MainActivity.class);
                    startActivity(intent);
                }
            });
        }
         else if(i==1) {
            startActivity(new Intent(this, IntroActivity.class));
            but1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplication(), Login.class);
                    startActivity(intent);
                }
            });

            but2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplication(), Register.class);
                    startActivity(intent);
                }
            });
        }
    }

}
