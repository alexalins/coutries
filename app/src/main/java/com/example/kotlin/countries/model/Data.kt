package com.example.kotlin.countries.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName( value = "name")
    val name: String?,
    @SerializedName( value = "capital")
    val capital: String?,
    @SerializedName( value = "flagPNG")
    val flag: String?
)