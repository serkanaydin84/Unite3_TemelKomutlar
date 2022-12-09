package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg12Activity extends AppCompatActivity {

    private final String TAG = "Etiket";
    private int sayi = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg12_activity);
    }

    public void btnIslemYap(View view) {
        Log.i(TAG,"Düğmeye tıklandı");

        EditText editText = (EditText) findViewById(R.id.text);
        Log.i(TAG,"Edit Text tanımlandı");

        String s1 = editText.getText().toString();
        Log.i(TAG, "Edit Text içindeki yazı alındı");

        try {
            sayi = Integer.parseInt(s1);
            Log.i(TAG, "Yazı sayıya çevrildi");
        } catch (Exception e) {
            Log.e(TAG, "Çevrim Hatası");
            sayi = 0;
        }
    }
}
