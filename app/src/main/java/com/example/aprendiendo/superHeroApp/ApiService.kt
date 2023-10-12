package com.example.aprendiendo.superHeroApp

import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {

    @GET("/api/10229506880952612/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superHeroName: String): retrofit2.Response<SuperHeroDataResponse>

    @GET("/api/10229506880952612/{id}")
    suspend fun getSuperHeroDetail(@Path("id") superHeroId: String): retrofit2.Response<SuperHeroDetailResponse>

}