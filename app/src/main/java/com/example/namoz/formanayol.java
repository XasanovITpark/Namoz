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

public class formanayol extends AppCompatActivity {
    ConstraintLayout mornign, mornign1, mornign2, mornign3, mornign4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_formanayol);
        mornign = findViewById(R.id.bomdodnmzzzzzzzzzzz);
        mornign1 = findViewById(R.id.peshinnmzzzzzzzzzzzzzzz);
        mornign2 = findViewById(R.id.asrnmzzzzzzzzzzzzzzzzzzz);
        mornign3 = findViewById(R.id.shomnmzzzzzzzzzzzzzzz);
        mornign4 = findViewById(R.id.xuftonnmzzzzzzzzzzzzzzzz);
        mornign.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
        mornign1.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
        mornign2.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
        mornign3.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });
        mornign4.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, bomdodnamoz.class);
            startActivity(intent1);
        });

    }
}