package com.example.textcomponent.jetpackCompose.scaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyScreen(){

    Scaffold(
        topBar = { AppTopBar()}
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            // Empty for now
        }
    }
}
