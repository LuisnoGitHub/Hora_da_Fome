package pdmprova1.horadafome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewActivity extends AppCompatActivity {

    private Button btn_reservar;
    private Button btn_mesas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        btn_reservar = findViewById(R.id.btn_reservar);
        btn_mesas = findViewById(R.id.btn_mesas);

        btn_reservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewActivity.this, Cadastro_cliente.class));
            }

        });

        btn_mesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewActivity.this, ReservarMesasActivity.class));
            }

        });
    }
    }
