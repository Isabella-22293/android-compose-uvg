package com.zezzi.eventzezziapp.ui.meals.view

import com.zezzi.eventzezziapp.data.networking.response.MealResponse

class MealsUiState(
    val Meals: List<MealsResponse>
    val loading: Boolean = false
)