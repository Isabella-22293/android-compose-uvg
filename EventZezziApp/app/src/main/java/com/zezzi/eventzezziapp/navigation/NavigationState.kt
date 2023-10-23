package com.zezzi.eventzezziapp.navigation

sealed class NavigationState(val route: String) {
    object Categories: NavigationState("Categories")
    object Meals: NavigationState("Meals")
    object Recipes: NavigationState("Recipes")
}