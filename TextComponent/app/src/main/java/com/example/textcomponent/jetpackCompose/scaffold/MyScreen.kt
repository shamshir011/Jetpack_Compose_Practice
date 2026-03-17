package com.example.textcomponent.jetpackCompose.scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.textcomponent.jetpackCompose.ModifierExample

@Composable
fun MyScreen(){

    Scaffold(
        topBar = { AppTopBar()},
        bottomBar = {AppBottomBar()},
        floatingActionButton = {FAB()}
    ) { innerPadding ->
//        paddingValues ->
        Box(modifier = Modifier.padding(innerPadding)) {

        }
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            for (i in 1..15){
                MyScreenContent()
        }

//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()
//            MyScreenContent()

        }

//        LazyColumn(
//            modifier = Modifier.fillMaxSize()
//                .padding(innerPadding)
//                .padding(vertical = 16.dp),
//            verticalArrangement = Arrangement.spacedBy(10.dp)
//        ) {
//            items(15){
//                MyScreenContent()
//            }
//        }
    }
}
