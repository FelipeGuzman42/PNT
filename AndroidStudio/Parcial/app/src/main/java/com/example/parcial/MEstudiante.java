package com.example.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MEstudiante extends AppCompatActivity {
    ImageButton Buscar, Reservar, Sacar, Renovar, Datos;
    String cuerpo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mestudiante);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://profe50.herokuapp.com/")
                .build();
        final HerokuService service = retrofit.create(HerokuService.class);

        Bundle extras = getIntent().getExtras();
        String clave;
        if (savedInstanceState == null) {
            if(extras == null) {
                clave = "";
            } else {
                clave = extras.getString("codigo");
            }
        } else {
            clave = (String) savedInstanceState.getSerializable("codigo");
        }

        final String claves = clave;

        Reservar = (ImageButton)findViewById(R.id.Reservar);
        Buscar = (ImageButton)findViewById(R.id.Buscar);
        Sacar = (ImageButton)findViewById(R.id.Sacar);
        Renovar = (ImageButton)findViewById(R.id.Renovar);
        Datos = (ImageButton)findViewById(R.id.Datos);

        Reservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MEstudiante.this, Libro.class);
                String reservar = "Reservar";
                i.putExtra("accio", reservar);
                startActivity(i);
            }
        });

        Buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MEstudiante.this, Libro.class);
                String buscar = "Buscar";
                i.putExtra("accio", buscar);
                startActivity(i);
            }
        });
        Sacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MEstudiante.this, Libro.class);
                String sacar = "Sacar";
                i.putExtra("accio", sacar);
                startActivity(i);
            }
        });
        //objeto relaciones
        Renovar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MEstudiante.this, Libro.class);
                String renovar = "Renovar";
                Bundle extras = new Bundle();
                extras.putString("accio", renovar);
                extras.putString("codigo", claves);
                i.putExtras(extras);
                startActivity(i);
            }
        });
        Datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<ResponseBody> call = service.buscaregistroE(claves);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            cuerpo = response.body().string();

                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
                Intent i=new Intent(MEstudiante.this, Registro.class);
                i.putExtra("todo", cuerpo);
                finish();
                startActivity(i);
            }
        });
    }
}
