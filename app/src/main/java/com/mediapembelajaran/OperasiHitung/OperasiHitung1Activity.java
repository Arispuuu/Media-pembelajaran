package com.mediapembelajaran.OperasiHitung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.mediapembelajaran.MainActivity;
import com.mediapembelajaran.MateriActivity;
import com.mediapembelajaran.R;

public class OperasiHitung1Activity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operasi_hitung1);

        pindah = findViewById(R.id.btkembali);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OperasiHitung1Activity.this, MateriActivity.class);
                startActivity(intent);

            }
        });

        pindah = findViewById(R.id.bthome);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OperasiHitung1Activity.this, MainActivity.class);
                startActivity(intent);

            }
        });



    }
}