package com.example.textcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.textcomponent.jetpackCompose.LazyColumnExample
import com.example.textcomponent.jetpackCompose.navigation.LoginScreenUI
import com.example.textcomponent.jetpackCompose.navigation.NavGraph
import com.example.textcomponent.ui.theme.TextComponentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextComponentTheme{
                LazyColumnExample()
            }
        }
    }
}
