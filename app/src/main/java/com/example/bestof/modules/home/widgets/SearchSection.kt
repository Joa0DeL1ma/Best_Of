package com.example.bestof.modules.home.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bestof.R

@Composable
fun SearchSection (modifier: Modifier = Modifier) {
    val searchText = ""
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically

    ) {
        OutlinedTextField(
            value = "", onValueChange = {},
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xffD9D9D9),
                unfocusedContainerColor = Color(0xffD9D9D9),
                unfocusedBorderColor = Color(0xffD9D9D9),
            ),
            singleLine = true,
            textStyle = TextStyle(textAlign = TextAlign.Center),
            label = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "",
                    tint = Color.Black
                )
            },
            trailingIcon = {
                if (searchText != "") { //todo realizar uma mudança de enabled aqui
                    IconButton(
                        content = {
                            Icon(
                                imageVector = Icons.Filled.Search,
                                contentDescription = "",
                                tint = Color.Black
                            )
                        }, onClick = {}
                    )
                }
            },
            shape = RoundedCornerShape(40.dp)

        )
        IconButton(
            onClick = { /*TODO*/ }) {
            Icon(
                modifier = Modifier.size(32.dp),
                painter = painterResource(id = R.drawable.ic_search_sort),
                contentDescription = ""
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SearchSectionPreview() {
    SearchSection()
}