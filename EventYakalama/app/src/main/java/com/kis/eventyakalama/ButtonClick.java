package com.kis.eventyakalama;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ButtonClick implements View.OnClickListener {

    private String msg;
    private Context context;
    public ButtonClick(String msg, Context context) {
        this.msg = msg;
        this.context = context;
    }
    
    @Override
    public void onClick(View v) {
        Toast.makeText(context,msg, Toast.LENGTH_LONG).show();
    }
}
