package com.zezzi.eventzezziapp.ui.meals.view

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import kotlinx.coroutines.launch

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    var CategoriesUiState by mutableStateOf(MealsCategoriesUiState(emptyList()))
     private set

    fun getCategories() {
        CategoriesUiState = MealsCategoriesUiState(emptyList(), loading = true)
        viewModelScope.launch {
            CategoriesUiState = MealsCategoriesUiState(
                Categories = repository.getCategories().Categories,
                loading = false
            )
        }
    }
}