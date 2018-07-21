package com.example.selectfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class SelectCount extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4,editText5,editText6;
    int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_count);

        final TextView textView = (TextView) findViewById(R.id.textView5);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);


        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                int count = (int)rating;
                textView.setText(count+2 + "개");

                c  = count;

                if(count == 1){
                    editText4.setVisibility(View.INVISIBLE);
                    editText5.setVisibility(View.INVISIBLE);
                    editText6.setVisibility(View.INVISIBLE);
                }

                else if(count == 2){
                    editText4.setVisibility(View.VISIBLE);
                    editText5.setVisibility(View.INVISIBLE);
                    editText6.setVisibility(View.INVISIBLE);
                }
                else if(count == 3){
                    editText4.setVisibility(View.VISIBLE);
                    editText5.setVisibility(View.VISIBLE);
                    editText6.setVisibility(View.INVISIBLE);
                }
                else if(count == 4) {
                    editText4.setVisibility(View.VISIBLE);
                    editText5.setVisibility(View.VISIBLE);
                    editText6.setVisibility(View.VISIBLE);
                }
            }
        });

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Circle.class);

                intent.putExtra("t1", editText1.getText().toString());
                intent.putExtra("t2", editText2.getText().toString());
                intent.putExtra("t3", editText3.getText().toString());
                intent.putExtra("t4", editText4.getText().toString());
                intent.putExtra("t5", editText5.getText().toString());
                intent.putExtra("t6", editText6.getText().toString());
                intent.putExtra("count", c);

                View focusView = null;
                boolean con = true;

                if(c == 0 || c == 1){
                    if (TextUtils.isEmpty(editText1.getText().toString())) {
                        editText1.setError(getString(R.string.error_field_required));
                        focusView = editText1;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText2.getText().toString())){
                        editText2.setError(getString(R.string.error_field_required));
                        focusView = editText2;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText3.getText().toString())){
                        editText3.setError(getString(R.string.error_field_required));
                        focusView = editText3;
                        con = false;
                    }else{
                        startActivity(intent);
                    }
                }
                else if(c == 2){
                    if (TextUtils.isEmpty(editText2.getText().toString())) {
                        editText2.setError(getString(R.string.error_field_required));
                        focusView = editText2;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText2.getText().toString())){
                        editText2.setError(getString(R.string.error_field_required));
                        focusView = editText2;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText3.getText().toString())){
                        editText3.setError(getString(R.string.error_field_required));
                        focusView = editText3;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText4.getText().toString())){
                        editText4.setError(getString(R.string.error_field_required));
                        focusView = editText4;
                        con = false;
                    }else{
                        startActivity(intent);
                    }
                }
                else if(c == 3){
                    if (TextUtils.isEmpty(editText2.getText().toString())) {
                        editText2.setError(getString(R.string.error_field_required));
                        focusView = editText2;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText2.getText().toString())){
                        editText2.setError(getString(R.string.error_field_required));
                        focusView = editText2;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText3.getText().toString())){
                        editText3.setError(getString(R.string.error_field_required));
                        focusView = editText3;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText4.getText().toString())){
                        editText4.setError(getString(R.string.error_field_required));
                        focusView = editText4;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText5.getText().toString())){
                        editText5.setError(getString(R.string.error_field_required));
                        focusView = editText5;
                        con = false;
                    }else{
                        startActivity(intent);
                    }
                }
                else if(c == 4){
                    if (TextUtils.isEmpty(editText2.getText().toString())) {
                        editText2.setError(getString(R.string.error_field_required));
                        focusView = editText2;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText2.getText().toString())){
                        editText2.setError(getString(R.string.error_field_required));
                        focusView = editText2;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText3.getText().toString())){
                        editText3.setError(getString(R.string.error_field_required));
                        focusView = editText3;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText4.getText().toString())){
                        editText4.setError(getString(R.string.error_field_required));
                        focusView = editText4;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText5.getText().toString())){
                        editText5.setError(getString(R.string.error_field_required));
                        focusView = editText5;
                        con = false;
                    }
                    else if(TextUtils.isEmpty(editText6.getText().toString())){
                        editText6.setError(getString(R.string.error_field_required));
                        focusView = editText6;
                        con = false;
                    }
                    else{
                        startActivity(intent);
                    }
                }



            }
        });
    }
    private boolean nullText(String text) {

        return text.length() > 0;
    }
}
