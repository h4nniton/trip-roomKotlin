package br.senai.sp.jandira.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.R

@Composable
fun TelaHome() {

    Surface (
        modifier = Modifier.fillMaxSize()
    ) {

        Column {

            Card (
                modifier = Modifier

            ) {

                Image(
                    painter = painterResource(id = R.drawable.paris),
                    contentDescription = "PARIS",
                    contentScale = ContentScale.FillBounds,
                    modifier = 
                )
            }
        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun TelaHomePreview() {
    TelaHome()
}