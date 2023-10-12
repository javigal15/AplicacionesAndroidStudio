package com.example.aprendiendo.superHeroApp

import com.google.gson.annotations.SerializedName
import retrofit2.http.Url

data class SuperHeroDataResponse(
    @SerializedName("response") val response: String,
    @SerializedName("results") val superheroes: List<SuperHeroItemResponse>,
)

data class SuperHeroItemResponse(
    @SerializedName("id") val superHeroId: String,
    @SerializedName("name") val superHeroName: String,
    @SerializedName("image") val superHeroImage: SuperHeroImageResponse
)

data class SuperHeroImageResponse(
    @SerializedName("url") val superHeroImageUrl: String,
)

