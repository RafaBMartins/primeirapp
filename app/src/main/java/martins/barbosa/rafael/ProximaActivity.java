package martins.barbosa.rafael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProximaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxima);
        //Pegando a intent que criou a tela e armazenando em uma variavel
        Intent intent = getIntent();
        //Pegando do dicionario da intent o valor com chave "texto" e armazenando em uma variavel
        String texto = intent.getStringExtra("texto");
        //Armazenando o textView de ProximaActivity.xml em uma variavel
        TextView tvExibir = findViewById(R.id.tvExibir);
        //Definindo o texto da textView com o valor do texto do dicionario
        tvExibir.setText(texto);
    }
}