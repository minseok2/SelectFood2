package com.example.selectfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class Login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText idText = (EditText) findViewById(R.id.editText7);
        final EditText pwText = (EditText) findViewById(R.id.editText8);

        final Button button = (Button) findViewById(R.id.button3);

        final Button button2 = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String userID = idText.getText().toString();
                final String userPassword = pwText.getText().toString();
                View focusView = null;
                boolean con = true;

                if (TextUtils.isEmpty(userID)) {
                    idText.setError(getString(R.string.error_field_required));
                    focusView = idText;
                    con = false;
                }

                if (TextUtils.isEmpty(userPassword)) {
                    pwText.setError(getString(R.string.error_field_required));
                    focusView = pwText;
                    con = false;
                }

                if (con) {
                    final Response.Listener<String> responseListener = new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                boolean success = jsonObject.getBoolean("success");

                                if (success) {
                                    String userID = jsonObject.getString("userID");
                                    String userPassword = jsonObject.getString("userPassword");
                                    String name = jsonObject.getString("userName");

                                    Intent intent = new Intent(getApplication(),MainActivity.class);
                                    intent.putExtra("userID", userID);
                                    intent.putExtra("userPassword", userPassword);
                                    intent.putExtra("userName", name);
                                    intent.putExtra("i",0);

                                    startActivity(intent);
                                } else {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                                    builder.setMessage("로그인에 실패하셨습니다.")
                                            .setNegativeButton("다시 시도", null)
                                            .create()
                                            .show();
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }


                        }
                    };

                    LoginRequest loginRequest = new LoginRequest(userID, userPassword, responseListener);
                    RequestQueue queue = Volley.newRequestQueue(Login.this);
                    queue.add(loginRequest);
                }
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplication(), Register.class);
                startActivity(in);
            }
        });
    }


}

