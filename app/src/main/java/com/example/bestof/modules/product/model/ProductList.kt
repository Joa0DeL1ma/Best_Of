package com.example.bestof.modules.product.model

import android.net.Uri

data class ProductList(
    val name: String,
    val stars: Float,
    val price: Float,
    val reviews: Int,
    val medalType: String,
    val description: String,
    val url: Uri,
    val image1: Uri,
    val image2: Uri,
    val image3: Uri,
    val image4: Uri,
    val image5: Uri,
) {


}
