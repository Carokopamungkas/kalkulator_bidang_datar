package com.aji.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SegitigaFragment extends Fragment {

    private EditText alas, tinggi, sisi;
    private Button btnhasil;
    private TextView hasil_luas, hasil_keliling;
    private TextView textView;

    public SegitigaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_segitiga, container, false);


        alas = v.findViewById(R.id.txt_alas);
        tinggi = v.findViewById(R.id.txt_tinggi);
        sisi = v.findViewById(R.id.txt_sisi);
        btnhasil = v.findViewById(R.id.btnHasil);
        hasil_luas = v.findViewById(R.id.hasilLuas);
        hasil_keliling = v.findViewById(R.id.hasilKeliling);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = alas.getText().toString();
                String nilai2 = tinggi.getText().toString();
                String nilai3 = sisi.getText().toString();

                if (nilai1.isEmpty()) {
                    alas.setError("data tidak boleh kosong");
                    tinggi.requestFocus();
                } else if (nilai2.isEmpty()) {
                    alas.setError("data tidak boleh kosong");
                    tinggi.requestFocus();
                } else if (nilai3.isEmpty()) {
                    sisi.setError("data tidak boleh kosong");
                } else {

                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);
                    Double sisi = Double.parseDouble(nilai3);

                    Double Luas = 0.5 * alas * tinggi;
                    Double Keliling = 3 * sisi;
                    hasil_luas.setText(String.format("%.2f", Luas));
                    hasil_keliling.setText(Keliling.toString());
                }
            }
        });


        return v;
    }
}