package martins.barbosa.rafael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Armazenando o botão de MainActivity.xml em uma variavel
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //Definindo um ouvidor de cliques(evento) para o botão que acabei de pegar
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            //Metodo que sera acionado ou clicar no botão
            @Override
            public void onClick(View view) {
                //Armazenando o editText de MainActivity.xml em uma variavel
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //Pegando o texto de editText e armazenando em uma variavel do tipo str
                String texto = etDigiteAqui.getText().toString();
                //Criando a intenção de viajar de MainActivity para ProximaActivity
                Intent intent = new Intent(MainActivity.this, ProximaActivity.class);
                //Colocando no dicionario que acompanhara a intent a variavel que contem o texto com a chave "texto"
                intent.putExtra("texto", texto);
                //Executando a intent
                startActivity(intent);
            }
        });
    }
}