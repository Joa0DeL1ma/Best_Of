package com.example.bestof.modules.categories.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bestof.R
import com.example.bestof.modules.cart.widgets.BackButton
import com.example.bestof.modules.categories.model.itemList
import com.example.bestof.ui.theme.BestOfTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriesScreen() {
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
                }
            )
        },
        content = { padding ->

            Row(modifier = Modifier.padding(padding)) {
                Column { //todo fazer uma section aqui
                    Box {
                        BackButton(
                            modifier = Modifier.padding(
                                start = 4.dp,
                                top = 16.dp,
                                bottom = 15.dp
                            )
                        )
                    }

                    LazyColumn {
                        items(itemList) { category ->
                            Row(
                                modifier = Modifier
                                    .background(Color(0xffD9D9D9))
                                    .width(115.dp)
                            ) {
                                Icon(
                                    modifier = Modifier.align(Alignment.CenterVertically),
                                    imageVector = category.icon,
                                    contentDescription = ""
                                )
                                Text(
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = 2,
                                    modifier = Modifier.padding(
                                        start = 8.dp,
                                        top = 12.dp,
                                        bottom = 8.dp
                                    ),
                                    style = MaterialTheme.typography.labelLarge,
                                    text = category.name
                                )
                            }
                        }
                    }


                }
                val rows = itemList.chunked(3)
                    LazyColumn(modifier = Modifier) {
                        item{
                            Spacer(modifier = Modifier.height(70.dp))
                        }
                        itemsIndexed(rows) { _, rowItems ->
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                modifier = Modifier.padding(8.dp)
                            ) {
                                rowItems.forEach { item ->
                                    Column(
                                        modifier = Modifier
                                            .padding(start = 4.dp, bottom = 4.dp)
                                            .height(70.dp)
                                            .weight(1f)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(Color(0xffD9D9D9)),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Icon(
                                            imageVector = item.icon,
                                            contentDescription = item.name
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = item.name,
                                        )
                                    }
                                }
                                repeat(3 - rowItems.size) {
                                    Text(
                                        text = "", // Empty text
                                        modifier = Modifier.weight(1f) // Takes up the same space as others
                                    )
                                }
                            }
                        }
                    }
                }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.height(56.dp),
                containerColor = Color(0xffD9D9D9)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 48.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Home, contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(0.dp),
                                text = "Home",
                                style = MaterialTheme.typography.labelMedium,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_savings_filled),
                                contentDescription = "",
                            )
                            Text(
                                modifier = Modifier.padding(0.dp),
                                text = "Deals",
                                style = MaterialTheme.typography.labelMedium,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_categories_search),
                                contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(0.dp),
                                text = "Categories",
                                style = MaterialTheme.typography.labelMedium,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Person, contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(0.dp),
                                text = "Profile",
                                style = MaterialTheme.typography.labelMedium,
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
private fun CategoriesScreenPreview() {
    BestOfTheme {
        CategoriesScreen()
    }
}