package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Unit(
    @SerializedName("abbreviation") val abbreviation: String,
    @SerializedName("display_plural") val display_plural: String,
    @SerializedName("display_singular") val display_singular: String,
    @SerializedName("name") val name: String,
    @SerializedName("system") val system: String
)
