package com.joel.random.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.joel.random.views.VillainList

fun NavGraphBuilder.villainsGraph(
    navController: NavHostController
){

    navigation(
        startDestination = Villains.VILLAINS_LIST,
        route = Villains.VILLAINS_GRAPH
    ){
        composable(
            route = Villains.VILLAINS_LIST
        ){
            VillainList()
        }
    }




}