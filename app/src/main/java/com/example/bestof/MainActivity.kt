package com.example.bestof

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.bestof.modules.cart.screens.DealsScreen
import com.example.bestof.modules.categories.screens.CategoriesScreen
import com.example.bestof.modules.home.screens.HomeScreen
import com.example.bestof.modules.product.ProductScreen
import com.example.bestof.modules.product.model.Headphone
import com.example.bestof.modules.product.model.ProductInfo
import com.example.bestof.ui.theme.BestOfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BestOfTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //DealsScreen()
                    //HomeScreen()
                    ProductScreen(product = Headphone[1])
                    //CategoriesScreen()
                }
            }
        }
    }
}