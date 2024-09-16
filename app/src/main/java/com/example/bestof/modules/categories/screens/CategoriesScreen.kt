package com.example.bestof.modules.categories.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.example.bestof.modules.categories.model.CategoriesItems
import com.example.bestof.modules.categories.model.categoriesList
import com.example.bestof.modules.categories.model.computerAccessoriesList
import com.example.bestof.modules.categories.model.electronicsList
import com.example.bestof.ui.theme.BestOfTheme
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriesScreen() {
    val categoryMap = mapOf(
        "Electronics" to electronicsList,
//        "Home & Kitchen" to homeKitchenList,
//        "Shoes" to shoesList,
//        "Toys & Games" to toysGamesList,
//        "Sports & Outdoors" to sportsOutdoorsList,
//        "Pet Supplies" to petSuppliesList,
//        "Office Supplies" to officeSuppliesList,
//        "Tools" to toolsList,
//        "Garden & Pool" to gardenPoolList,
//        "Baby Products" to babyProductsList,
//        "Grocery & Gourmet" to groceryGourmetList,
//        "Automotive" to automotiveList,
//        "Musical Instruments" to musicalInstrumentsList,
        "Computer Accessories" to computerAccessoriesList,
    )
    var selectedType by remember { mutableStateOf<List<CategoriesItems>?>(electronicsList) }
    var selectedIndex by remember { mutableStateOf<Int?>(0) }

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
                Column {
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
                        itemsIndexed(categoriesList) { index, category ->
                            val isSelected = selectedIndex == index
                            Row(
                                modifier = Modifier
                                    .height(44.dp)
                                    .width(115.dp)
                                    .clickable(
                                        interactionSource = remember { MutableInteractionSource() },
                                        indication = null,
                                        onClick = {
                                            selectedIndex = if (isSelected) null else index
                                            selectedType =
                                                if (isSelected) null else categoryMap[category.name]
                                        }
                                    )
                                    .then(if (!isSelected) Modifier.background(Color(0xFFD9D9D9)) else Modifier)
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .padding(start = 2.dp)
                                        .align(Alignment.CenterVertically),
                                    painter = painterResource(id = category.icon),
                                    contentDescription = null
                                )
                                Text(
                                    overflow = TextOverflow.Clip,
                                    maxLines = 2,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .padding(start = 4.dp),
                                    style = MaterialTheme.typography.labelLarge,
                                    text = category.name
                                )
                            }
                        }
                    }
                }

                val rows = selectedType?.chunked(3) ?: emptyList()
                LazyColumn(modifier = Modifier) {
                    item {
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
                                        painter = painterResource(id = item.icon),
                                        contentDescription = item.name
                                    )
                                    Text(
                                        modifier = Modifier.padding(
                                            top = 4.dp,
                                            start = 4.dp,
                                            end = 4.dp
                                        ),
                                        style = MaterialTheme.typography.labelMedium,
                                        textAlign = TextAlign.Center,
                                        text = item.name,
                                    )
                                }
                            }
                            repeat(3 - rowItems.size) {
                                Text(
                                    text = "",
                                    modifier = Modifier.weight(1f)
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
