package com.app.blogs.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun BlogApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "list"){
        composable("list"){
            BlogListScreen(navController = navController)
        }
        composable(
            "detail/{postUrl}",
            arguments = listOf(navArgument("postUrl") { type = NavType.StringType })
        ){backStackEntry ->
            val postUrl = backStackEntry.arguments?.getString("postUrl") ?: ""
            BlogDetailScreen(postUrl = postUrl, onBack ={ navController.popBackStack()})

        }

    }
}