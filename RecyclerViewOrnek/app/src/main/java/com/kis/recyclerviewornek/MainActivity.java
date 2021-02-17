package com.kis.recyclerviewornek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<SocialMedia> sosyalListe;
    RecyclerView recyclerSosyal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerSosyal = findViewById(R.id.recyclerSosyal);

        sosyalMedayaOlustur();

    }
    public void sosyalMedayaOlustur(){
        sosyalListe = new ArrayList<>();

        Collections.addAll(sosyalListe,
                new SocialMedia("Facebook",R.drawable.facebook),
                new SocialMedia("Twitter", R.drawable.twitter),
                new SocialMedia("Gmail",R.drawable.gmail)
        );
    }
}
