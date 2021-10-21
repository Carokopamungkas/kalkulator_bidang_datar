package com.aji.kalkulatorbidangdatar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PersegiFragment extends Fragment {
    private Button btnHasil;
    private EditText sisi;
    private TextView hasil_luas, hasil_keliling;

    public PersegiFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi, container, false);

        sisi = v.findViewById(R.id.txt_sisi);
        btnHasil = v.findViewById(R.id.btnHasil);
        hasil_luas = v.findViewById(R.id.hasilLuas);
        hasil_keliling = v.findViewById(R.id.hasilKeliling);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = sisi.getText().toString();

                if (nilai.isEmpty()) {
                    sisi.setError("data tidak boleh kosong");
                    sisi.requestFocus();
                } else {
                    Double sisi = Double.parseDouble(nilai);

                    Double Luas = sisi * sisi;
                    Double Keliling = 4 * sisi;

                    hasil_luas.setText(String.format("%2f", Luas));
                    hasil_keliling.setText(String.format("%2f", Keliling));
                }
            }
        });


        return v;

    }
}