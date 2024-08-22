package com.example.e_commerce.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavHost (
    navController: NavHostController =rememberNavController(),
){
    NavHost(navController=navController,startDestination=StartDestination){

    }
}