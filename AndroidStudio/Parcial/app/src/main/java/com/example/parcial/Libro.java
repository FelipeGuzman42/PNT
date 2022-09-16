package com.example.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Libro extends AppCompatActivity {
String pista, id;
String cuerpo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://profe50.herokuapp.com/")
                .build();
        final HerokuService service = retrofit.create(HerokuService.class);

        ImageButton Bbuscar = (ImageButton)findViewById(R.id.Bbuscar);
        ImageButton Btodos = (ImageButton)findViewById(R.id.Btodos);

        Bundle extras = getIntent().getExtras();
        if (savedInstanceState == null) {
            if(extras == null) {
                this.pista = null;
                this.id = null;
            } else {
                this.pista = extras.getString("accio");
                this.id = extras.getString("codigo");
            }
        } else {
            this.pista = (String) savedInstanceState.getSerializable("accio");
            this.id = (String) savedInstanceState.getSerializable("codigo");
        }
        final String code = this.id;

        Bbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText buscar = (EditText)findViewById(R.id.buscar);

                String buscars = buscar.getText().toString();

                Call<ResponseBody> call = service.buscar(buscars);

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

                Intent i=new Intent(Libro.this, ActividadLibro.class);
                Bundle extras = new Bundle();
                extras.putString("accio", pista);
                extras.putString("textos", cuerpo);
                extras.putString("codigo", code);
                i.putExtras(extras);
                finish();
                startActivity(i);
            }
        });

        Btodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final TextView todos = (TextView)findViewById(R.id.todos);

                if(pista.equals("Renovar")){
                    Call<ResponseBody> call = service.todasReservas(code);

                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            try{
                                todos.setText(response.body().string());
                            } catch (IOException e){
                                e.printStackTrace();
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {
                            t.printStackTrace();
                        }
                    });
                } else{
                    Call<ResponseBody> call = service.todosLibros();

                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                            try{
                                todos.setText(response.body().string());
                            } catch (IOException e){
                                e.printStackTrace();
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {
                            t.printStackTrace();
                        }
                    });
                }
            }
        });
    }
}
