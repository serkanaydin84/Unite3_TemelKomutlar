package com.example.temelkomutlarunite_3;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11Activity extends AppCompatActivity {

    private final String _TAG = "Etiket";
    private int sayi = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11_activity);

        EditText txt = findViewById(R.id.txt);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(_TAG, "debug (hata ayıklama)");
                Log.i(_TAG, "Butona tıklandı");
                Log.i(_TAG, "EditText tanımlandı");

                String s1 = txt.getText().toString();
                Log.w(_TAG, "EditText içindeki yazı alındı");

                sayi = Integer.parseInt(s1);
                Log.e(_TAG, "Yazı sayıya çevrildi");

                sayi += 2;
                Log.i(_TAG, "sayıya 2 eklendi");
            }
        });
    }
}
