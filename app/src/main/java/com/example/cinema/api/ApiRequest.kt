package com.example.cinema.api

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


const val BASE_URL = "http://cinema.areas.su/"

interface ApiRequest {
    @POST("auth/register")
    @FormUrlEncoded
    suspend fun signup(@Field("email") email: String, @Field("password") password: String, @Field("firstName") firstName: String, @Field("lastName") lastName: String):Response<String>
}