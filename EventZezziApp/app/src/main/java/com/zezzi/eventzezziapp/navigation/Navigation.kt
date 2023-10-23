package com.zezzi.eventzezziapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zezzi.eventzezziapp.ui.meals.view.MealsCategoriesScreen
import com.zezzi.eventzezziapp.ui.meals.view.MealsScreen

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationState.Categories.route,
        modifier = modifier
    ) {
        composable(route = NavigationState.Categories.route + "/{Category}") { backStackEntry ->) {
            MealsCategoriesScreen(navController)
        }
        composable(route = NavigationState.Meals.route + "/{Meal}") { backStackEntry ->
            MealsScreen(navController, backStackEntry.arguments?.getString("Meal") ?:"")
        }
        composable(route = NavigationState.Recipes.route + "/{Recipe}") { backStackEntry ->
            MealsScreen(navController, backStackEntry.arguments?.getString("Recipe") ?:"")
        }
    }
}