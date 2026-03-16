package com.example.textcomponent.jetpackCompose.navigation

import kotlinx.serialization.Serializable

/*Sealed class creates a restricted hierarchy
So its subclasses can only be defined in the same file */

@Serializable
sealed class MyNavRoutes {

    @Serializable
    object LoginScreen: MyNavRoutes()

    @Serializable
    object HomeScreen: MyNavRoutes()

    @Serializable
    data class WelcomeScreen(val userName: String): MyNavRoutes()
}