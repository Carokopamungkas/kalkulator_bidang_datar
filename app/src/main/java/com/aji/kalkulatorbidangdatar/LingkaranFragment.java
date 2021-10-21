package com.aji.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LingkaranFragment extends Fragment {

    private Button btnhasil;
    private EditText jari;
    private TextView hasil_luas, hasil_keliling;

    public LingkaranFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);


        btnhasil = (Button) v.findViewById(R.id.btnHasil);
        jari = (EditText) v.findViewById(R.id.txt_jari);
        hasil_luas = (TextView) v.findViewById(R.id.hasilLuas);
        hasil_keliling= (TextView) v.findViewById(R.id.hasilKeliling);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = jari.getText().toString();

                if (nilai.isEmpty()) {
                    jari.setError("Data tidak boeh kosong");
                    jari.requestFocus();

                } else {
                    Double jari = Double.parseDouble(nilai);
                    Double luas = 3.14 * jari * jari ;
                    Double keliling = 2 * 3.14 * jari;

                    hasil_luas.setText(String.format("%2f", luas));
                    hasil_keliling.setText(String.format("%2f", keliling));

                }

            }
        });


        return v;
    }
}