package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Show(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String
)