package app.rede.com.aplicativosolidario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadastrar extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        Button btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(this);

        Button btnVoltar = (Button) findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public  void onClick(View v){

        switch (v.getId()){
            case R.id.btnCadastrar:
                    Intent itCad = new Intent(this,Donativos.class);
                    startActivity(itCad);
                break;
            case R.id.btnVoltar:
                Intent itVol = new Intent(this,MainActivity.class);
                startActivity(itVol);
        }

    }
}
