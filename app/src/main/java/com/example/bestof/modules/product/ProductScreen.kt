package com.example.bestof.modules.product

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bestof.modules.product.model.Headphone
import com.example.bestof.modules.product.model.ProductInfo
import com.example.bestof.modules.product.widgets.ProductInformation
import com.example.bestof.ui.theme.BestOfTheme


@Composable
fun ProductScreen(product: ProductInfo) {
    Column {
        Column(
            modifier = Modifier
                .padding(top = 16.dp)
                .weight(1f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
                ProductInformation(
                    modifier = Modifier.padding(
                        vertical = 16.dp,
                        horizontal = 12.dp
                    ), product = product
                )
            }
        }
    }

@Preview(showBackground = true)
@Composable
private fun ProductScreenPreview() {
    BestOfTheme {
        ProductScreen(product = Headphone[1])
    }
}