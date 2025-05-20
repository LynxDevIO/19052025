package puc.mobile.a19052025;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import puc.mobile.a19052025.model.Evento;

public class Tela3Activity extends AppCompatActivity {
    private TextView textoData, textoRegistro;
    private ListView lista;
    private Button btnRegistrar;

    private ArrayAdapter<Evento> adapter;
    private List<Evento> listaBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_3_activity);

        configurarInterface();
        configurarListeners();
    }

    private void configurarInterface() {
        lista = findViewById(R.id.lista);
        textoData = findViewById(R.id.data);
        textoRegistro = findViewById(R.id.texto_registro);
        btnRegistrar = findViewById(R.id.btn_registrar_evento);

        listaBase = new ArrayList<>();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaBase);
        lista.setAdapter(adapter);
    }

    private void configurarListeners() {
        btnRegistrar.setOnClickListener(v -> {
            if (verificarDescricao() && verificarData()) {
                Evento evento = new Evento();
                evento.setDesc(textoRegistro.getText().toString());
                evento.setData(textoData.getText().toString());
                listaBase.add(evento);
                adapter.notifyDataSetChanged();
            }
        });

        Toast.makeText(this, "Evento adicionado com sucesso!", Toast.LENGTH_SHORT).show();
    }

    private boolean verificarData() {
        if (textoData.getText().toString().equals("Definir Data")) {
            Toast.makeText(this, "A data não pode estar vazia!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private boolean verificarDescricao() {
        if (textoRegistro.getText().toString().isEmpty()) {
            Toast.makeText(this, "A descrição do evento não pode estar vazia!", Toast.LENGTH_SHORT).show();
            textoRegistro.setError("Vazio!");
            return false;
        }
        return true;
    }

    public void definirData(View view) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                (DatePicker view1, int selectedYear, int selectedMonth, int selectedDay) -> {
                    String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                    textoData.setText(selectedDate);
                },
                year, month, day
        );

        datePickerDialog.show();
    }
}
