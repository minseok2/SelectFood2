package com.example.selectfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText id = (EditText) findViewById(R.id.editText9);
        final EditText pw = (EditText) findViewById(R.id.editText10);
        final EditText name = (EditText) findViewById(R.id.editText11);
        final EditText age = (EditText)findViewById(R.id.editText12);

        Button button = (Button) findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userID = id.getText().toString();
                String userPassword = pw.getText().toString();
                String userName = name.getText().toString();
                int userAge = Integer.parseInt(age.getText().toString());

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if(success){
                                AlertDialog.Builder builder = new AlertDialog.Builder(Register.this);
                                builder.setMessage("회원등록에 성공했습니다.")
                                        .setPositiveButton("확인",null)
                                        .create()
                                        .show();

                                Intent intent = new Intent(Register.this, MainActivity.class);
                                Register.this.startActivity(intent);
                            }else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(Register.this);
                                builder.setMessage("회원등록에 실패했습니다.")
                                        .setNegativeButton("다시 시도",null)
                                        .create()
                                        .show();
                            }

                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                    }

                };

                RegisterRequester registerRequester = new RegisterRequester(userID, userPassword, userName, userAge, responseListener);
                RequestQueue requestQueue = Volley.newRequestQueue(Register.this);
                requestQueue.add(registerRequester);
            }
        });

        Button button1 =(Button) findViewById(R.id.button6);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }



    }

