package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {

    EditText txt1;
    EditText txt2;
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);

        txt1 = findViewById(R.id.txtSayi1);
        txt2 = findViewById(R.id.txtSayi2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txt1.getText().toString());
                int y = Integer.parseInt(txt2.getText().toString());
                int toplam = x + y;
                int fark = x - y;
                int carpim = x * y;
                int bolme = x / y;
                int mod = x % y;
                x++;
                y--;
                System.out.println("Toplam: " + toplam);
                System.out.println("Fark: " + fark);
                System.out.println("Çarpım: " + carpim);
                System.out.println("Bölme: " + bolme);
                System.out.println("Mod Alma: " + mod);
                System.out.println("Artırma: " + x);
                System.out.println("Azaltma: " + y);
                System.out.println("-------------------------");
            }
        });
    }
}
