package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Section(
    @SerializedName("components") val components: List<Component>,
    @SerializedName("name") val name: Any,
    @SerializedName("position") val position: Int
)
