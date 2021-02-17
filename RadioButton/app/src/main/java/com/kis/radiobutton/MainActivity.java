package com.kis.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rbCash, rbVisa;
    RadioGroup radioGroupOdeme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbCash = findViewById(R.id.rbCash);
        rbVisa = findViewById(R.id.rbVisa);
        radioGroupOdeme = findViewById(R.id.radioGroupOdeme);

        rbVisa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "radio button seşilidi", Toast.LENGTH_LONG) ;
        }
     });
  }
  public void onClick(View view){
    Toast.makeText(this,"radio button Cash seçili",Toast.LENGTH_LONG).show();
}

    public void odeme(View view) {
        int rbSeciliolaninIdsi = radioGroupOdeme.getCheckedRadioButtonId();
        switch
    }
    }