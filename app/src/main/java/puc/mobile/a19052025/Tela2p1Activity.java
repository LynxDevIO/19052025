package puc.mobile.a19052025;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Tela2p1Activity extends AppCompatActivity {
    private EditText limiteInferior, limiteSuperior;
    private Button btnGerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2p1_activity);

        configurarInterface();
        configurarListeners();
    }

    private void configurarInterface() {
        limiteInferior = findViewById(R.id.limite_inferior);
        limiteSuperior = findViewById(R.id.limite_superior);
        btnGerar = findViewById(R.id.btn_gerar);
    }

    private void configurarListeners() {
        btnGerar.setOnClickListener(v -> {
            if (checarValores()) {
                gerarValor();
            } else {
                gerarValor(Float.parseFloat(limiteInferior.getText().toString()), Float.parseFloat(limiteSuperior.getText().toString()));
            }
        });
    }

    private boolean checarValores() {
        return limiteInferior.getText().toString().isEmpty() && limiteSuperior.getText().toString().isEmpty();
    }

    private float gerarValor() {
        Random random = new Random();
        return random.nextFloat();
    }

    private float gerarValor(float limiteInferior, float limiteSuperior) {
        Random random = new Random();
        return limiteInferior + random.nextFloat() * (limiteSuperior - limiteInferior);
    }
}
