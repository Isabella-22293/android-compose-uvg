package com.zezzi.eventzezziapp.ui.meals.view

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import kotlinx.coroutines.launch

class RecipesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    var RecipesUiState by mutableStateOf(RecipesUiState(emptyList()))
     private set

    fun getmeals() {
        RecipesUiState = RecipesUiState(emptyList(), loading = true)
        viewModelScope.launch {
            RecipesUiState = RecipesUiState(
                Categories = repository.getRecipes().Recipes,
                loading = false
            )
        }
    }
}