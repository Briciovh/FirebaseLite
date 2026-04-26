package com.softeen.firebaselite

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.softeen.firebaselite.presentation.initial.InitialScreen
import com.softeen.firebaselite.presentation.login.LoginScreen
import com.softeen.firebaselite.presentation.signup.SignupScreen

@Composable
fun NavigationWrapper(navHostController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navHostController, startDestination = "initial", modifier = modifier) {
        composable("initial") {
            InitialScreen()
        }
        composable("login") {
            LoginScreen()
        }
        composable("signup") {
            SignupScreen()
        }
    }
}