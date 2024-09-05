package com.example.bestof.modules.categories.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class CategoriesItems(val icon: ImageVector, val name: String)

val itemList = listOf(
    CategoriesItems(Icons.Default.Home, "Electronics"),
    CategoriesItems(Icons.Default.Settings, "Home & Kitchen"),
    CategoriesItems(Icons.Default.Person, "Beauty & Care"),
    CategoriesItems(Icons.Default.Home, "Shoes & Jewelry"),
    CategoriesItems(Icons.Default.Settings, "Toys & Games"),
    CategoriesItems(Icons.Default.Person, "Health & Baby Care"),
    CategoriesItems(Icons.Default.Home, "Cell & Accessories"),
    CategoriesItems(Icons.Default.Settings, "Sports & Outdoors"),
    CategoriesItems(Icons.Default.Person, "Pet Supplies"),
    CategoriesItems(Icons.Default.Home, "Office Supplies"),
    CategoriesItems(Icons.Default.Settings, "Tools"),
    CategoriesItems(Icons.Default.Person, "Garden & Outdoor"),
    CategoriesItems(Icons.Default.Home, "Baby Products"),
    CategoriesItems(Icons.Default.Settings, "Fashion"),
    CategoriesItems(Icons.Default.Person, "Grocery & Gourmet"),
    CategoriesItems(Icons.Default.Home, "Automotive"),
    CategoriesItems(Icons.Default.Person, "Musical Instruments"),
    CategoriesItems(Icons.Default.Home, "Luggage & Travel Gear"),
    CategoriesItems(Icons.Default.Settings, "Computer Accessories"),
    CategoriesItems(Icons.Default.Person, "Watches"),
    CategoriesItems(Icons.Default.Home, "Beauty & Makeup"),
    CategoriesItems(Icons.Default.Settings, "Cleaning Supplies"),
    CategoriesItems(Icons.Default.Person, "Bathroom Products"),
    CategoriesItems(Icons.Default.Settings, "CDs & Vinyl"),
    CategoriesItems(Icons.Default.Person, "Video Games"),
    CategoriesItems(Icons.Default.Home, "Industrial & Scientific"),
    CategoriesItems(Icons.Default.Settings, "Arts, Crafts & Sewing"),
    CategoriesItems(Icons.Default.Person, "Health & Fitness"),
    CategoriesItems(Icons.Default.Home, "Collectibles & Fine Art")
)