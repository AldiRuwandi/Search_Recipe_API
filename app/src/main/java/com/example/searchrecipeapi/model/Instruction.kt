package com.example.searchrecipeapi.model

import com.google.gson.annotations.SerializedName

class Instruction(
    @SerializedName("appliance") val appliance: Any,
    @SerializedName("display_text") val display_text: String,
    @SerializedName("end_time") val end_time: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("position") val position: Int,
    @SerializedName("start_time") val start_time: Int,
    @SerializedName("temperature") val temperature: Any
)
