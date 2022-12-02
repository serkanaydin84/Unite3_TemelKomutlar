package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);

        EditText txtSayi = findViewById(R.id.txtSayi);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtSayi.getText().toString());
                System.out.println("x = " + x);

                x += 3;
                System.out.println("x += 3 : " + x);

                x -= 2;
                System.out.println("x -= 2 : " + x);

                x *= 5;
                System.out.println("x *= 5 : " + x);

                x /= 4;
                System.out.println("x /= 4 : " + x);

                x %= 2;
                System.out.println("x %= 2 : " + x);

                System.out.println("--------------------");
            }
        });
    }
}
