package com.example.bestof.modules.home.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bestof.R

@Composable
fun ProductsListRow(modifier: Modifier = Modifier) {
    val name = "Sony wh-1000xm5"
    var originalText = name
    val maxLength = 12
    val displayText = if (originalText.length > maxLength) {
        originalText.take(maxLength) + "..."
    } else {
        originalText
    }
    Column {
        Text(
            modifier = Modifier.padding(8.dp),
            style = MaterialTheme.typography.titleSmall,
            text = "Headsets"
        )
        Box(
            modifier = Modifier,
        ) {
            Box(
                modifier = Modifier
                    .size(180.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xffD9D9D9),
                        shape = RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier.padding(16.dp),
                    painter = painterResource(id = R.drawable.sonywh1000xm5),
                    contentDescription = "",
                    contentScale = ContentScale.Fit,
                    alignment = Alignment.Center
                )
            }
        }
        Row {
            Icon(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .size(52.dp),
                painter = painterResource(id = R.drawable.ic_products_medal),
                tint = Color(0xfff4af3f),
                contentDescription = ""
            )
            Column {
                Row(modifier = Modifier.padding(top = 14.dp)) {
                    Text(text = "4,7", style = MaterialTheme.typography.bodySmall)
                    for (i in 1..5) {
                        Icon(
                            modifier = Modifier.size(16.dp),
                            painter = painterResource(id = R.drawable.ic_star_filled),
                            contentDescription = ""
                        )
                    }
                }
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = displayText,
                    )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductsListRowPreview() {
    ProductsListRow()
}