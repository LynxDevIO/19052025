package puc.mobile.a19052025;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Tela2p2Activity extends AppCompatActivity {
    private EditText palavra;
    private Button btnInverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2p2_activity);

        configurarInterface();
        configurarListeners();
    }

    private void configurarInterface() {
        btnInverter = findViewById(R.id.btn_inverter);
    }

    private void configurarListeners() {
        btnInverter.setOnClickListener(v -> {
            String palavra = inverterPalavra();

            Intent intent = new Intent(this, Tela2p3Activity.class);
            intent.putExtra("palavra", palavra);
            startActivity(intent);
        });
    }

    private String inverterPalavra() {
        char[] array = palavra.getText().toString().toCharArray();
        List<Character> listaCaracteresPalavra = new ArrayList<>();
        return listaCaracteresPalavra.sort(item -> listaCaracteresPalavra.indexOf(item) <= listaCaracteresPalavra.indexOf(item));
    }
}
