package com.example.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ActividadLibro extends AppCompatActivity {
    String code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_libro);

        final TextView acc = (TextView)findViewById(R.id.Taccion);
        final EditText isbn = (EditText)findViewById(R.id.isbn);
        final EditText nombreL = (EditText)findViewById(R.id.nombreL);
        final EditText autor = (EditText)findViewById(R.id.autor);
        final EditText copi = (EditText)findViewById(R.id.copi);
        final EditText descrip = (EditText)findViewById(R.id.descrip);
        final EditText palas = (EditText)findViewById(R.id.palas);

        Bundle extras = getIntent().getExtras();
        String poner = extras.getString("accio");
        String texto = extras.getString("textos");
        code = extras.getString("codigo");
        final String codes = code;

        if(texto != null && !texto.isEmpty()){
            String[] varios = texto.split(",");
            isbn.setText(varios[0]);
            nombreL.setText(varios[1]);
            autor.setText(varios[2]);
            descrip.setText(varios[3]);
            palas.setText(varios[4]);
            copi.setText(varios[5]);
        }
        acc.setText(poner);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://profe50.herokuapp.com/")
                .build();
        final HerokuService service = retrofit.create(HerokuService.class);

        ImageButton Accion = (ImageButton)findViewById(R.id.Accion);

        Accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isbns = isbn.getText().toString();
                String nombreLs = nombreL.getText().toString();
                String autors = autor.getText().toString();
                String copis = copi.getText().toString();
                String descrips = descrip.getText().toString();
                String palass = palas.getText().toString();

                if(acc.getText().toString().equals("Agregar")){
                    Call<ResponseBody> call = service.agregar(isbns, nombreLs, autors, copis, descrips, palass);
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {

                        }
                    });
                } else if(acc.getText().toString().equals("Modificar")){
                    Call<ResponseBody> call = service.eliminar(isbns);
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {

                        }
                    });
                    call = service.agregar(isbns, nombreLs, autors, copis, descrips, palass);
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {

                        }
                    });
                } else if(acc.getText().toString().equals("Eliminar")){
                    Call<ResponseBody> call = service.eliminar(isbns);
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {

                        }
                    });
                } else if(acc.getText().toString().equals("Reservar")){
                    Call<ResponseBody> call = service.reservar(isbns, codes);
                    call.enqueue(new Callback<ResponseBody>() {
                        @Override
                        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                        }

                        @Override
                        public void onFailure(Call<ResponseBody> call, Throwable t) {

                        }
                    });
                }
                Intent i=new Intent(ActividadLibro.this, MBibliotecario.class);
                finish();
                startActivity(i);
            }
        });
    }
}
