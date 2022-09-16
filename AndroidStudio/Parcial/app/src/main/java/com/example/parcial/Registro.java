package com.example.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Registro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://profe50.herokuapp.com/")
                .build();
        final HerokuService service = retrofit.create(HerokuService.class);

        String textos;

        final EditText email = (EditText)findViewById(R.id.email);
        final EditText nom = (EditText)findViewById(R.id.name);
        final EditText docu = (EditText)findViewById(R.id.documento);
        final EditText dircar = (EditText)findViewById(R.id.direccion);
        final EditText opc = (EditText)findViewById(R.id.telefono);
        final EditText pass = (EditText)findViewById(R.id.password);
        RadioButton biblio = (RadioButton)findViewById(R.id.RBiblio);
        RadioButton estus = (RadioButton)findViewById(R.id.RBestu);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                textos = "";
            } else {
                textos = extras.getString("todo");
            }
        } else {
            textos = (String) savedInstanceState.getSerializable("todo");
        }

        if(textos != null && !textos.isEmpty()){
            String[] varios = textos.split(",");
            email.setText(varios[0]);
            nom.setText(varios[2]);
            docu.setText(varios[3]);
            dircar.setText(varios[4]);
            if(varios[5] != null && !varios[5].isEmpty()){
                pass.setText(varios[1]);
                estus.setChecked(true);
            } else {
                opc.setText(varios[5]);
                pass.setText(varios[1]);
                biblio.setChecked(true);
            }
        }

        ImageButton aceptar = (ImageButton)findViewById(R.id.aceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emails = email.getText().toString();
                String noms = nom.getText().toString();
                String docus = docu.getText().toString();
                String dircars = dircar.getText().toString();
                String opcs = opc.getText().toString();
                String passs = pass.getText().toString();

                Call<ResponseBody> call = service.registro(emails, noms, docus, dircars, opcs, passs);

                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });

                if(opcs.equals("")){
                    Intent i=new Intent(Registro.this, MEstudiante.class);
                    i.putExtra("codigo", docus);
                    finish();
                    startActivity(i);
                } else {
                    Intent i=new Intent(Registro.this, MBibliotecario.class);
                    i.putExtra("codigo", docus);
                    finish();
                    startActivity(i);
                }
            }
        });
    }

    public void escoger(View view){
        final EditText text1 = (EditText)findViewById(R.id.direccion);
        final EditText text2 = (EditText)findViewById(R.id.telefono);

        boolean checked = ((RadioButton)view).isChecked();

        switch(view.getId()){
            case R.id.RBiblio:
                if(checked){
                    text1.setText("Dirección");
                    text2.setText("Teléfono");
                    text2.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.RBestu:
                if(checked){
                    text1.setText("Carrera");
                    text2.setText("");
                    text2.setVisibility(View.GONE);
                }
                break;
        }
    }
}
