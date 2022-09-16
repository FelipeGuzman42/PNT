package com.example.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Principal extends AppCompatActivity {
    ImageButton Registro, Ingresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://profe50.herokuapp.com/")
                .build();
        final HerokuService service = retrofit.create(HerokuService.class);

        Registro = (ImageButton)findViewById(R.id.Registrate);
        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Principal.this, Registro.class);
                startActivity(i);
            }
        });

        Ingresa = (ImageButton)findViewById(R.id.Ingresar);
        Ingresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText email = (EditText)findViewById(R.id.name);
                final EditText pass = (EditText)findViewById(R.id.contra);

                String emails = email.getText().toString();
                String passs = pass.getText().toString();

                Call<ResponseBody> call = service.comprobar(emails, passs);

                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            String cuerpo = response.body().string();
                            String [] separar = cuerpo.split(",");
                            if(separar[0].equals("true1")){
                                Intent i=new Intent(Principal.this, MBibliotecario.class);
                                i.putExtra("codigo", separar[1]);
                                startActivity(i);
                            } else if (separar[0].equals("true2")){
                                Intent i=new Intent(Principal.this, MEstudiante.class);
                                i.putExtra("codigo", separar[1]);
                                startActivity(i);
                            }

                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
            }
        });
    }
}
