package com.example.parcial;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface HerokuService{
    //principañ
    @FormUrlEncoded
    @POST("/comprobar")
    Call<ResponseBody>comprobar(@Field("name") String a, @Field("contra") String b);

    @FormUrlEncoded
    //registro
    @POST("/registro")
    Call<ResponseBody>registro(@Field("email") String a, @Field("name") String b,
                               @Field("documento") String c, @Field("direccion") String d,
                               @Field("telefono") String e, @Field("password") String f);

    @FormUrlEncoded
    //libro
    @POST("/buscar")
    Call<ResponseBody>buscar(@Field("buscar") String g);

    @FormUrlEncoded
    @POST("/todosLibros")
    Call<ResponseBody>todosLibros();

    @FormUrlEncoded
    @POST("/todasReservas")
    Call<ResponseBody>todasReservas(@Field("documento") String c);

    @FormUrlEncoded
    //actividad libro
    @POST("/agregar")
    Call<ResponseBody>agregar(@Field("isbn") String a, @Field("nombreL") String b,
                               @Field("autor") String c, @Field("descrip") String d,
                               @Field("palas") String e, @Field("copi") String f);

    @FormUrlEncoded
    @POST("/eliminar")
    Call<ResponseBody>eliminar(@Field("isbn") String g);

    @FormUrlEncoded
    @POST("/reservar")
    Call<ResponseBody>reservar(@Field("isbn") String g, @Field("documento") String a);

    @FormUrlEncoded
    //MBibliotecario
    @POST("/buscaregistro")
    Call<ResponseBody>buscaregistro(@Field("documento") String g);

    //MEstudiante
    @FormUrlEncoded
    @POST("/buscaregistroE")
    Call<ResponseBody>buscaregistroE(@Field("documento") String g);

}