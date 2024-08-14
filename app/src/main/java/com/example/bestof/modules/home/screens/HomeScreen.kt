package com.example.bestof.modules.home.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bestof.R
import com.example.bestof.ui.theme.BestOfTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier.height(50.dp),
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color(0xffD9D9D9)),
                title = {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Best of",
                            style = MaterialTheme.typography.headlineMedium
                        )
                    }

                })
        },
        content = { padding ->
            Text("Content goes here", modifier = Modifier.padding(padding))
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.height(50.dp),
                containerColor = Color(0xffD9D9D9)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 48.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(onClick = { /*TODO*/ }, Modifier.fillMaxSize().weight(1f)) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                modifier = Modifier.size(22.dp),
                                imageVector = Icons.Filled.Home, contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(0.dp),
                                text = "Home",
                                style = MaterialTheme.typography.labelSmall,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }, Modifier.fillMaxSize().weight(1f)) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                modifier = Modifier.size(22.dp),
                                imageVector = Icons.Filled.ShoppingCart, contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(0.dp),
                                text = "Cart",
                                style = MaterialTheme.typography.labelSmall,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }, Modifier.fillMaxSize().weight(1f)) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                modifier = Modifier.size(22.dp),
                                painter = painterResource(id = R.drawable.ic_categories_search),
                                contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(0.dp),
                                text = "Categories",
                                style = MaterialTheme.typography.labelSmall,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }, Modifier.fillMaxSize().weight(1f)) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                modifier = Modifier.size(22.dp),
                                imageVector = Icons.Filled.Person, contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(0.dp),
                                text = "Profile",
                                style = MaterialTheme.typography.labelSmall,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
    )
}


@Preview
@Composable
private fun HomeScreenPreview() {
    BestOfTheme {
        HomeScreen()
    }
}