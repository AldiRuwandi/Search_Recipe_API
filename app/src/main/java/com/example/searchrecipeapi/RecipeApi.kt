package com.example.searchrecipeapi

import com.example.searchrecipeapi.model.RecipeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url

interface RecipeApi {

    @Headers(
        value = [
            "X-RapidAPI-Key: 48e073dac0msh3db60c8d2421ea5p155a37jsna00c8cbe75ac",
            "X-RapidAPI-Host: tasty.p.rapidapi.com"
        ]
    )
    @GET
    fun getRecipes(@Url url: String): Call<RecipeResponse>
}