package com.example.bestof.modules.product.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.bestof.R
import com.example.bestof.modules.product.model.Headphone
import com.example.bestof.modules.product.model.ProductInfo
import com.example.bestof.ui.theme.BestOfTheme


@OptIn(ExperimentalFoundationApi::class, ExperimentalGlideComposeApi::class)
@Composable
fun ProductInformation(
    modifier: Modifier = Modifier,
    product: ProductInfo
) {
    //val pagerState = rememberPagerState(initialPage = 0, pageCount = { 5 })

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
    ) {

//        HorizontalPager(
//            state = pagerState,
//            modifier = Modifier.weight(1f)
//        ) {
            GlideImage(
                model = "https://images.pexels.com/photos/1649771/pexels-photo-1649771.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                contentDescription = "product photo",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
        )
//        }

//        // Indicador de página
//        Text(
//            text = "${pagerState.currentPage + 1}/${images.size}",
//            modifier = Modifier
//                .align(Alignment.CenterHorizontally)
//                .padding(top = 8.dp),
//            fontSize = 16.sp
//        )
//    }
    }
        Column(modifier = modifier) {
            Text(
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                text = product.name,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Normal, // todo ver de colocar aqui o fontWeight thin, talvez tirar dúvidas com Ale dps
                modifier = Modifier
                    .width(400.dp)
            )
            Row(modifier = Modifier.padding(top = 8.dp)) {
                Text(
                    modifier = Modifier.align(Alignment.Bottom),
                    maxLines = 1, //todo fazer com que os cents sejam menores
                    text = "U$ ${product.price}",
                    style = MaterialTheme.typography.headlineMedium,
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    modifier = Modifier
                        .align(Alignment.Bottom)
                        .padding(end = 4.dp),
                    text = product.stars.toString(),
                    style = MaterialTheme.typography.headlineMedium,
                    fontSize = 26.sp
                )
                for (i in 1..5) { //todo fazer a lógica de preenchimento da estrela pela nota
                    Icon(
                        modifier = Modifier
                            .padding(bottom = 1.dp)
                            .size(30.dp)
                            .align(Alignment.Bottom),
                        painter = painterResource(id = R.drawable.ic_star_filled),
                        contentDescription = "Estrela preenchida",
                        tint = Color(0xffde7921)
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Icon( // todo ajustar as cores das medalhas
                    painter = painterResource(id = R.drawable.ic_products_medal),
                    contentDescription = "Medalha",
                    tint = when (product.medalType) {
                        "Gold" -> Color(0xfff4af3f)
                        "Silver" -> Color.Gray
                        "Bronze" -> Color(0xffc57a2f)
                        else -> {
                            Color.Black
                        }
                    },
                    modifier = Modifier
                        .size(26.dp)
                )
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(end = 4.dp),
                    text = "(${product.reviews} Reviews)"
                )
            }
            Text(
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
                text = "Product information",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Normal,
            ) //todo fazer o texto em inglês na lista
            Text( // todo place limiter on section size here
                style = MaterialTheme.typography.bodyMedium,
                text = product.description
            )
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffFFEA00),
                    contentColor = Color.Black
                )
            ) {
                Text(text = "Buy Now", style = MaterialTheme.typography.bodyLarge)
            }
//        OutlinedButton(
//            modifier = Modifier
//                .padding(top = 4.dp)
//                .fillMaxWidth(),
//            onClick = { /*TODO*/ },
//            border = BorderStroke(1.dp, Color.Black),
//            colors = ButtonDefaults.outlinedButtonColors(
//                contentColor = Color.Black
//            )
//        ) {
//            Text(text = "Buy Now", style = MaterialTheme.typography.bodyLarge)
//        }
        }
    }


@Preview(showBackground = true)
@Composable
fun ProductInformationPreview() {
    BestOfTheme {
        ProductInformation(
            product = Headphone[1]
            )
    }
}
