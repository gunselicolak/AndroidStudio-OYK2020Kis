package com.kis.intentparcelableornek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        Kitap k = new Kitap("Vakif Kurulurken",30);

        intent = new Intent(this,IkinciAktivite.class);

        intent.putExtra("kitap",k);

        startActivity(intent);

    }
}
