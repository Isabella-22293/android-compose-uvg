package com.zezzi.eventzezziapp.ui.meals.view

import com.zezzi.eventzezziapp.data.networking.response.MealResponse

class RecipesUiState(
    val Recipes: List<RecipesResponse>
    val loading: Boolean = false
)