package com.kis.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity 
{
    CheckBox cb1,cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.cb1);

        cb2.setOnClickListener();
    }

    public void onClick(View view)
    {
        if(view.getId()==R.id.cb1){
            if(cb1.isChecked())
                display(CheckBox 1 secildi);
            else
                display("CheckBox 1 seçilmedi");
        }
    }
    public void display(String msg)
    {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
