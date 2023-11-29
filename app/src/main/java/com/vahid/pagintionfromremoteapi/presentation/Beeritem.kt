package com.vahid.pagintionfromremoteapi.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.vahid.pagintionfromremoteapi.domain.Beer
import com.vahid.pagintionfromremoteapi.ui.theme.PagintionFromRemoteApiTheme

@Composable
fun BeerItem(
    beer: Beer,
    modifier: Modifier
) {
    Card(
        modifier = modifier
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Max)
                .padding(16.dp)
        ) {
            AsyncImage(
                model = beer.imageUrl,
                contentDescription = beer.name,
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = beer.name, style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = beer.tagline, fontStyle = FontStyle.Italic, color = Color.LightGray,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = beer.description,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "First brewed in ${beer.firstBrewed}",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End,
                    fontSize = 8.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun BeerItemPreview() {
    PagintionFromRemoteApiTheme {
        BeerItem(
            beer = Beer(
                id = 1,
                name = "Beer",
                tagline = "this is tagline",
                firstBrewed = "07/05/2023",
                description = "this is description for beer",
                imageUrl = null
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}