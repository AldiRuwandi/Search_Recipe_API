package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class RecipeResponse(
    @SerializedName("count") val count: Int,
    @SerializedName("results") var results: List<Recipe>
)
