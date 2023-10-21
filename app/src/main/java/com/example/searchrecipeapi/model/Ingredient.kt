package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Ingredient(
    @SerializedName("created_at") val created_at: Int,
    @SerializedName("display_plural") val display_plural: String,
    @SerializedName("display_singular") val display_singular: String,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("updated_at") val updated_at: Int
)
