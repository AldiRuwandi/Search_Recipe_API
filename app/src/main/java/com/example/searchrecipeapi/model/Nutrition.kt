package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Nutrition(
    @SerializedName("calories") val calories: Int,
    @SerializedName("carbohydrates") val carbohydrates: Int,
    @SerializedName("fat") val fat: Int,
    @SerializedName("fiber") val fiber: Int,
    @SerializedName("protein") val protein: Int,
    @SerializedName("sugar") val sugar: Int,
    @SerializedName("update_at") val update_at: String
)
