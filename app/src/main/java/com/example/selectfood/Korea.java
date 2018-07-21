package com.example.selectfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Korea extends AppCompatActivity {

    int count;
    TextView textView;
    String kf[] = { "설렁탕", "비빔밥", "갈비", "전골" ,"비빕밥", "국수","칼국수", "잡채", "된장찌게",
    "김치찌게", "소고기무국", "감자탕","부대찌게", "불고기", "전", "삼계탕", "미역국","아구찜"};
    String jf[] = {"스시", "돈까스", "메밀소바", "우동", "라멘", "타코야끼", "규동","샤브샤브", "우나쥬","야끼코리","오코노미야끼","돈부리","가츠동","미소국","니쿠쟈가"};
    String cf[] = {"탕수육","짜장면","짬뽕","깐쇼새우", "팔보채", "마파두부"
    ,"양장피","라조기","울면","유산슬밥"};
    String wf[] = {"스테이크", "감자튀김","햄버거","피자","수프","샐러드","파스타",
    "소세지", "라자냐", "빠에야"};
    String nf[] = {"치킨", "피자", "족발", "보쌈","닭발","등갈비","불고기","곱창","닭볶음탕"};
    String af[] = {"치킨","피자","꼬치","새우버터구이","삼겹살","부대찌게","해물탕","어묵탕","두부, 김치"
    ,"곱창볶음","전","치즈콘","버터구이 오징어","감자튀김","골뱅이 소면","소시지","과일","화채","닭똥집"};

    Random random = new Random();
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korea);

        textView = (TextView)findViewById(R.id.textView4);
        final Button button = (Button) findViewById(R.id.button2);

        textView2 = (TextView)findViewById(R.id.textView7);

        Intent intent = getIntent();
        count = intent.getIntExtra("count",0);

        switch (count){
            case 1:
                textView2.setText("오늘 먹을 한식은!?");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(kf[random.nextInt(kf.length)]);
                    }
                });
                break;
            case 2:
                textView2.setText("오늘 먹을 중식은!?");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(cf[random.nextInt(cf.length)]);
                    }
                }); break;
            case 3:
                textView2.setText("오늘 먹을 일식은!?");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(jf[random.nextInt(jf.length)]);
                    }
                }); break;
            case 4:
                textView2.setText("오늘 먹을 양식은!?");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(wf[random.nextInt(wf.length)]);
                    }
                }); break;
            case 5:
                textView2.setText("오늘 먹을 야식은!?");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(nf[random.nextInt(nf.length)]);
                    }
                }); break;
            case 6:
                textView2.setText("오늘 먹을 술안주는!?");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText(af[random.nextInt(af.length)]);
                    }
                }); break;
        }
    }
}
