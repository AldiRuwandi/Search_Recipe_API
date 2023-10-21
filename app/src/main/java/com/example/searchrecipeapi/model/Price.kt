package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Price(
    @SerializedName("consumption_portion") val consumption_portion: Int,
    @SerializedName("consumption_total") val consumption_total: Int,
    @SerializedName("portion") val portion: Int,
    @SerializedName("total") val total: Int,
    @SerializedName("updated_at") val updated_at: String
)
