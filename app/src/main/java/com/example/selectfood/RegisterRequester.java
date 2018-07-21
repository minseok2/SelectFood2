package com.example.selectfood;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 김민석 on 2017-08-22.
 */

public class RegisterRequester extends StringRequest {
    final static private String URL = "http://kim940011.cafe24.com/Register.php";
    private Map<String, String> parameters;

    public RegisterRequester(String userID, String userPassword ,
                             String userName, int userAge, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userAge", userAge + "");
    }

    public Map<String, String> getParams(){
        return parameters;
    }
}
