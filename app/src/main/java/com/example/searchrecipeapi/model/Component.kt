package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Component(
    @SerializedName("extra_comment") val extra_comment: String,
    @SerializedName("id") val id: Int,
    @SerializedName("ingredient") val ingredient: Ingredient,
    @SerializedName("measurements") val measurements: List<Measurement>,
    @SerializedName("position") val position: Int,
    @SerializedName("raw_text") val raw_text: String
)
