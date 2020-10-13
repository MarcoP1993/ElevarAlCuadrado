package com.example.elevaralcuadrado;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText texto_numero = null;
    TextView texto_resultado = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto_numero = findViewById(R.id.texto_numero);
        texto_resultado = findViewById(R.id.texto_resultado);//enlazo el texto(numero que voy a introducir) con el texto(resultado)
    }

    public void elevar(View view) {
        double numero = Double.valueOf(texto_numero.getText().toString());
        texto_resultado.setText(String.valueOf(numero * numero));
    }
}