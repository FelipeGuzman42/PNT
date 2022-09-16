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

public class MBibliotecario extends AppCompatActivity {
ImageButton Agregar, Buscar, Modificar, Eliminar, Datos;
String cuerpo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbibliotecario);

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

        Agregar = (ImageButton)findViewById(R.id.Reservar);
        Buscar = (ImageButton)findViewById(R.id.Buscar);
        Modificar = (ImageButton)findViewById(R.id.Sacar);
        Eliminar = (ImageButton)findViewById(R.id.Renovar);
        Datos = (ImageButton)findViewById(R.id.Datos);

        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MBibliotecario.this, ActividadLibro.class);
                String agregar = "Agregar";
                i.putExtra("accio", agregar);
                startActivity(i);
            }
        });

        Buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MBibliotecario.this, Libro.class);
                String buscar = "Buscar";
                i.putExtra("accio", buscar);
                startActivity(i);
            }
        });
        Modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MBibliotecario.this, Libro.class);
                String modificar = "Modificar";
                i.putExtra("accio", modificar);
                startActivity(i);
            }
        });
        Eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MBibliotecario.this, Libro.class);
                String eliminar = "Eliminar";
                i.putExtra("accio", eliminar);
                startActivity(i);
            }
        });
        Datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<ResponseBody> call = service.buscaregistro(claves);
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
                Intent i=new Intent(MBibliotecario.this, Registro.class);
                i.putExtra("todo", cuerpo);
                finish();
                startActivity(i);
            }
        });
    }
}
