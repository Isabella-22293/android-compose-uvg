package com.zezzi.eventzezziapp.data.networking.response

import com.google.gson.annotations.SerializedName

data class RecipesResponse(val recepies: List<Recipes>)

data class Recipes(
    @SerializedName("idIngredient") val id: String,
    @SerializedName("strIngredient") val ingredients: String,
    @SerializedName("strDescription") val description: String
    @SerializedName("strType") val type: null
)
