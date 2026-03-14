package com.example.namoz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class forman extends AppCompatActivity {
ConstraintLayout azonsasaasd, bomdod, peshin, asr, shom, xufton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forman);
azonsasaasd = findViewById(R.id.azonnnnn);
bomdod = findViewById(R.id.bomdodnmz);
        peshin = findViewById(R.id.peshinnmz);
        asr = findViewById(R.id.asrnmz);
        shom = findViewById(R.id.shomnmz);
        xufton = findViewById(R.id.xuftonnmz);


        azonsasaasd.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, morning.class);
            startActivity(intent1);
        });
        bomdod.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
        peshin.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
        asr.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
        shom.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
        xufton.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
    }
}