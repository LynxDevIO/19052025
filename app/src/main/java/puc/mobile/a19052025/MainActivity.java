package puc.mobile.a19052025;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurarInterface();
        configurarListeners();
    }

    private void configurarInterface() {
        btnAvancar = findViewById(R.id.btnAvancar);
    }

    private void configurarListeners() {
        btnAvancar.setOnClickListener(v -> {
            Intent intent = new Intent(this, Tela2Activity.class);
            startActivity(intent);
        });
    }
}