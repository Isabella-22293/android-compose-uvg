package com.zezzi.eventzezziapp.ui.meals.view

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import kotlinx.coroutines.launch

class MealsViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    var MealsUiState by mutableStateOf(MealsUiState(emptyList()))
     private set

    fun getmeals() {
        MealsUiState = MealsUiState(emptyList(), loading = true)
        viewModelScope.launch {
            MealsUiState = MealsUiState(
                Categories = repository.getMeals().Meals,
                loading = false
            )
        }
    }
}