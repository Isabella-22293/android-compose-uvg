package com.zezzi.eventzezziapp.ui.meals.view

import com.zezzi.eventzezziapp.data.networking.response.MealResponse

class MealsCategoriesUiState(
    val Categories: List<MealsCategoriesResponse>
    val loading: Boolean = false
)