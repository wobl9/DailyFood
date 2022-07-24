package ru.wobcorp.dailyfood

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.wobcorp.dailyfood.ui.theme.DailyFoodTheme

@Composable
fun DailyFoodApp() {
    DailyFoodTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Greeting("Android")
        }
    }
}