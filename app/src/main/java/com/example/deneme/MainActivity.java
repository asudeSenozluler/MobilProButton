package com.example.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

       Button btnGiris;
       EditText txtAd;
       TextView lblSonuc;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGiris =(Button) findViewById(R.id.btngiris);
        txtAd=(EditText)  findViewById(R.id.txtad);
        lblSonuc=(TextView) findViewById(R.id.lblsonuc);

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str =txtAd.getText().toString();
                lblSonuc.setText(str);
                //lblSonuc.setText(txtAd.getText().toString());
            }
        });


    }
}