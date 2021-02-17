package com.kis.intentparcelableornek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IkinciAktivite extends AppCompatActivity {

    Intent intent;
    Kitap k;
    TextView tvSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_aktivite);

        intent = getIntent();

        k=intent.getParcelableExtra("kitap");

        tvSonuc = findViewById(R.id.tvSonuc);

        tvSonuc.setText(k.toString());

    }
}
