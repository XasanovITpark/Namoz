package com.example.namoz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class tasbexx extends AppCompatActivity {
    int sub_count = 0;
    int al_count = 0;
    int allo_count = 0;

    TextView subhanalah0, Alhamdulillah0, Allohuakber0;
    Button subhanallahpilus, subhanallahminus, subhanallahrestart, Alhamdulillahpilus, Alhamdulillahminus,
            Alhamdulillahrestart, Alluhuakabrpilus, Alluhuakabrminus, Alluhuakabrrestart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbexx);

        subhanalah0 = findViewById(R.id.subhanallah_count);
        Alhamdulillah0 = findViewById(R.id.alhamdulillah_count);
        Allohuakber0 = findViewById(R.id.allohuakbar_count);
        subhanallahpilus = findViewById(R.id.btn_add_subhanallah);
        subhanallahminus = findViewById(R.id.btn_sub_subhanallah);
        subhanallahrestart = findViewById(R.id.btn_reset_subhanallah);
        Alhamdulillahpilus = findViewById(R.id.btn_add_alhamdulillah);
        Alhamdulillahminus = findViewById(R.id.btn_sub_alhamdulillah);
        Alhamdulillahrestart = findViewById(R.id.btn_reset_alhamdulillah);
        Alluhuakabrpilus = findViewById(R.id.btn_add_allohuakbar);
        Alluhuakabrminus = findViewById(R.id.btn_sub_allohuakbar);
        Alluhuakabrrestart = findViewById(R.id.btn_reset_allohuakbar);

        subhanallahpilus.setOnClickListener(view -> {
            sub_count++;
            subhanalah0.setText(String.valueOf(sub_count));
        });
        Alhamdulillahpilus.setOnClickListener(view -> {
            al_count++;
            Alhamdulillah0.setText(String.valueOf(al_count));
        });
        Alluhuakabrpilus.setOnClickListener(view -> {
            allo_count++;
            Allohuakber0.setText(String.valueOf(allo_count));
        });
        subhanallahminus.setOnClickListener(view -> {
            if (sub_count == 0) {
                Toast.makeText(this, "Hali bosmagansiz", Toast.LENGTH_LONG).show();
            } else {
                sub_count--;
                subhanalah0.setText(String.valueOf(sub_count));
            }

        });
        Alhamdulillahminus.setOnClickListener(view -> {
            if (al_count == 0) {
                Toast.makeText(this, "Hali bosmagansiz", Toast.LENGTH_LONG).show();
            } else {
                al_count--;
                Alhamdulillah0.setText(String.valueOf(al_count));
            }
        });
        Alluhuakabrminus.setOnClickListener(view -> {
            if (allo_count == 0) {
                Toast.makeText(this, "Hali bosmagansiz", Toast.LENGTH_LONG).show();
            } else {
                allo_count--;
                Allohuakber0.setText(String.valueOf(allo_count));
            }
        });
        subhanallahrestart.setOnClickListener(view -> {
            if (sub_count == 0) {
                Toast.makeText(this, "Hali bosmagansiz", Toast.LENGTH_LONG).show();
            } else {
                new AlertDialog.Builder(tasbexx.this).setTitle("Subhanallah")
                        .setMessage("Qayta boshlashni hohlaysizmi?")
                        .setPositiveButton("Ha", (dialog, which) -> {
                            Toast.makeText(tasbexx.this, "0 ga tushudi", Toast.LENGTH_LONG).show();

                            sub_count = 0;
                            subhanalah0.setText(String.valueOf(sub_count));
                        })
                        .setNegativeButton("Bekor qilish", null).show();
            }

        });
        Alhamdulillahrestart.setOnClickListener(view -> {
            if (al_count == 0) {
                Toast.makeText(this, "Hali bosmagansiz", Toast.LENGTH_LONG).show();
            } else {
                new AlertDialog.Builder(tasbexx.this).setTitle("Alhamdulillah")
                        .setMessage("Qayta boshlashni hohlaysizmi?")
                        .setPositiveButton("Ha", (dialog, which) -> {
                            Toast.makeText(tasbexx.this, "0 ga tushudi", Toast.LENGTH_LONG).show();

                            al_count = 0;
                            Alhamdulillah0.setText(String.valueOf(al_count));
                        })
                        .setNegativeButton("Bekor qilish", null).show();
            }

        });
        Alluhuakabrrestart.setOnClickListener(view -> {
            if (allo_count == 0) {
                Toast.makeText(this, "Hali bosmagansiz", Toast.LENGTH_LONG).show();
            } else {
                new AlertDialog.Builder(tasbexx.this).setTitle("Allohu Akbar").setMessage("Qayta boshlashni hohlaysizmi?")
                        .setPositiveButton("Ha", (dialog, which) -> {
                            Toast.makeText(tasbexx.this, "0 ga tushudi", Toast.LENGTH_LONG).show();

                            allo_count = 0;
                            Allohuakber0.setText(String.valueOf(allo_count));
                        })
                        .setNegativeButton("Bekor qilish", null).show();
            }

        });
    }
}
