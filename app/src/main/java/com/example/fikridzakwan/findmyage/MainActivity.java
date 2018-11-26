package com.example.fikridzakwan.findmyage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnUmur;
    EditText edt1;
    EditText edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUmur = findViewById(R.id.btnHitungUmur);
        edt1 = findViewById(R.id.edtMasukanTahun);
        edt2 = findViewById(R.id.edtUmurKamu);

        btnUmur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int year;
                int age;

                year = Integer.parseInt(edt1.getText().toString());
                age = (2018-year);

                edt2.setText("Umur Kamu Sekarang Adalah " + age);
            }
        });
    }
}
