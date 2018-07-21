package com.example.selectfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.anupcowkur.wheelmenu.WheelMenu;


public class Circle extends AppCompatActivity {

    WheelMenu imageView;
    TextView textView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        imageView = (WheelMenu) findViewById(R.id.imageView4);
        textView = (TextView) findViewById(R.id.textView6);

        final Intent intent = getIntent();


        count = intent.getIntExtra("count",1);

        textView.setText( "1 : " + intent.getStringExtra("t1"));
        imageView.setWheelImage(R.drawable.wheel);

                if(count == 1 || count == 0) {
                    //imageView.setWheelImage(R.drawable.wheel);
                    imageView.setDivCount(3);

                    imageView.setWheelChangeListener(new WheelMenu.WheelChangeListener() {
                        @Override
                        public void onSelectionChange(int i) {
                            if(i==0) {
                                textView.setText((i + 1) + " : " + intent.getStringExtra("t1"));
                            }
                            else if(i==1){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t2"));
                            }
                            else if(i==2){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t3"));
                            }
                        }
                    });

                }
        else if(count == 2) {
            imageView.setWheelImage(R.drawable.wheel2);
            imageView.setDivCount(4);

            imageView.setWheelChangeListener(new WheelMenu.WheelChangeListener() {
                @Override
                public void onSelectionChange(int i) {
                    if(i==0) {
                        textView.setText((i + 1) + " : " + intent.getStringExtra("t1"));
                    }
                    else if(i==1){
                        textView.setText((i+1) + " : " + intent.getStringExtra("t2"));
                    }
                    else if(i==2){
                        textView.setText((i+1) + " : " + intent.getStringExtra("t3"));
                    }
                    else if(i==3){
                        textView.setText((i+1) + " : " + intent.getStringExtra("t4"));
                    }
                }
            });

        }
                else if(count == 3) {
                    imageView.setWheelImage(R.drawable.wheel3);
                    imageView.setDivCount(5);

                    imageView.setWheelChangeListener(new WheelMenu.WheelChangeListener() {
                        @Override
                        public void onSelectionChange(int i) {
                            if(i==0) {
                                textView.setText((i + 1) + " : " + intent.getStringExtra("t1"));
                            }
                            else if(i==1){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t2"));
                            }
                            else if(i==2){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t3"));
                            }
                            else if(i==3){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t4"));
                            }
                            else if(i==4){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t5"));
                            }
                        }
                    });

                }
                else if(count == 4) {
                    imageView.setWheelImage(R.drawable.wheel4);
                    imageView.setDivCount(6);

                    imageView.setWheelChangeListener(new WheelMenu.WheelChangeListener() {
                        @Override
                        public void onSelectionChange(int i) {
                            if(i==0) {
                                textView.setText((i + 1) + " : " + intent.getStringExtra("t1"));
                            }
                            else if(i==1){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t2"));
                            }
                            else if(i==2){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t3"));
                            }
                            else if(i==3){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t4"));
                            }
                            else if(i==4){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t5"));
                            }
                            else if(i==5){
                                textView.setText((i+1) + " : " + intent.getStringExtra("t6"));
                            }
                        }
                    });

                }

    }
}
