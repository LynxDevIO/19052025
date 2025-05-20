package puc.mobile.a19052025;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tela2Activity extends AppCompatActivity {
    private Button btnGeradorValores, btnInversorPalavra, btnRegistroEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2_activity);

        configurarInterface();
        configurarListeners();
    }

    private void configurarInterface() {
        btnGeradorValores = findViewById(R.id.btnGeradorValores);
        btnInversorPalavra = findViewById(R.id.btnInversorPalavra);
        btnRegistroEventos = findViewById(R.id.btnRegistroEventos);
    }

    private void configurarListeners() {
        btnGeradorValores.setOnClickListener(v -> {
            Intent intent = new Intent(this, Tela2p1Activity.class);
            startActivity(intent);
        });

        btnInversorPalavra.setOnClickListener(v -> {
            Intent intent = new Intent(this, Tela2p2Activity.class);
            startActivity(intent);
        });

        btnRegistroEventos.setOnClickListener(v -> {
            Intent intent = new Intent(this, Tela3Activity.class);
            startActivity(intent);
        });
    }
}
