package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Tag(
    @SerializedName("display_name") val display_name: String,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("type") val type: String
)
