package com.kis.eventyakalama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    Button btnOk, btnOK2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.btnOK);
        btnOK2 = findViewById(R.id.btnOk2);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button  Ok", Toast.LENGTH_LONG).show();
            }
        });

        btnOk.setOnClickListener(this);
        ButtonClick bc = new ButtonClick("merhaba",this);
        btnOK2.setOnClickListener(bc);
    }


    @Override
    public void onClick(View v) {

    }
}
