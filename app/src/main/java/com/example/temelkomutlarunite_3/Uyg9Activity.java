package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);

        EditText txtSayi1 = findViewById(R.id.txtSayi1);
        EditText txtSayi2 = findViewById(R.id.txtSayi2);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtSayi1.getText().toString());
                int y = Integer.parseInt(txtSayi2.getText().toString());
                System.out.println("x ile y eşit mi : " + (x == y));
                System.out.println("x ile y farklı mı : " + (x != y));
                System.out.println("x, y’den büyük mü : " + (x > y));
                System.out.println("x, y’den küçük mü : " + (x < y));
                System.out.println("x, y’den büyük veya eşit mi : " + (x >= y));
                System.out.println("x, y’den küçük veya eşit mi : " + (x <= y));
                System.out.println("--------------------");
            }
        });
    }
}
