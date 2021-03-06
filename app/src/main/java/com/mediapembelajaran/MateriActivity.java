package com.mediapembelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.mediapembelajaran.OperasiHitung.OperasiHitung1Activity;
import com.mediapembelajaran.bilanganbulat.BilanganBulat1Activity;

public class MateriActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        pindah = findViewById(R.id.btBulat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MateriActivity.this, BilanganBulat1Activity.class);
                startActivity(intent);

            }
        });

        pindah = findViewById(R.id.btOperasi);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MateriActivity.this, OperasiHitung1Activity.class);
                startActivity(intent);

            }
        });



    }
}