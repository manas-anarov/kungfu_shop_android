package com.example.samuray.myapplication.HelpFuncFile;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedDataGetSet {




    public static String getMySavedToken(Context context){
        SharedPreferences preferences = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        String token_in_func = preferences.getString("token","");
        String result = "Token " + token_in_func;
        return result;
    }


    public static Boolean CheckForLogin(Context context) {

        SharedPreferences preferences = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        Boolean s = preferences.getBoolean("loggedin",false);

        return s;

    }


}
