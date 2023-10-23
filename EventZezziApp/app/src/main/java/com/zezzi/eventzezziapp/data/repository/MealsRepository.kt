package com.zezzi.eventzezziapp.data.repository

import com.zezzi.eventzezziapp.data.networking.MealsWebService
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getCategories(): MealsCategoriesResponse {
        return withContext(Dispatchers.IO) {
            webService.getMeals()
        }
    }
    suspend fun getMeals(): MealsResponse {
        return withContext(Dispatchers.IO) {
            webService.getmeals()
        }
    }
    suspend fun getRecipes(): RecipesResponse {
        return withContext(Dispatchers.IO) {
            webService.getRecipes()
        }
    }
}

