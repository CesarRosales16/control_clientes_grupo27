package com.example.control_clientes_grupo27;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text_entran, text_salen;
    private Button btn_entran, btn_salen;
    int cont_entran = 0, cont_salen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_entran = findViewById(R.id.text_cont_entran);
        text_salen = findViewById(R.id.text_cont_salen);
        btn_entran = findViewById(R.id.btn_entran);
        btn_salen = findViewById(R.id.btn_salen);

        btn_entran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont_entran++;
                text_entran.setText(Integer.toString(cont_entran));
            }
        });

        btn_salen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont_salen++;
                text_salen.setText(Integer.toString(cont_salen));
            }
        });
    }
}
