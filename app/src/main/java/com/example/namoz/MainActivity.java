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
public class MainActivity extends AppCompatActivity {
    ConstraintLayout taxoratorganish, erkaaklaruchunnamoz, ayollaruchunnamoz, tasebtayor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        taxoratorganish = findViewById(R.id.tahoratolish);
        erkaaklaruchunnamoz = findViewById(R.id.manfor);
        ayollaruchunnamoz = findViewById(R.id.womanfor);
        tasebtayor = findViewById(R.id.tasbehx);

        taxoratorganish.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, tahoratolish.class);
            startActivity(intent1);
        });
        erkaaklaruchunnamoz.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, forman.class);
            startActivity(intent1);
        });
        ayollaruchunnamoz.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, formanayol.class);
            startActivity(intent1);
        });
        tasebtayor.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, tasbexx.class);
            startActivity(intent1);
        });

    }
}
