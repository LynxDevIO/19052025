package puc.mobile.a19052025;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tela2p3Activity extends AppCompatActivity {
    private TextView textoInvertido;
    private Button btnNavegarRegistros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2p3_activity);

        configurarInterface();
        configurarListeners();
    }

    private void configurarInterface() {
        textoInvertido.findViewById(R.id.texto_invertido);
        btnNavegarRegistros = findViewById(R.id.btn_navegar_registros);

        textoInvertido.setText(getIntent().getStringExtra("palavra"));
    }

    private void configurarListeners() {
        btnNavegarRegistros.setOnClickListener(v -> {
            Intent intent = new Intent(this, Tela3Activity.class);
            startActivity(intent);
        });
    }
}
