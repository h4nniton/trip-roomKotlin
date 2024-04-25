package br.senai.sp.jandira.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.repository.caterogiaRepository

@Composable
fun TelaHome () {

    val categorias = caterogiaRepository().listarCategorias()

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column {

            Column {
                Image(
                    painter = painterResource(id = R.drawable.paris),
                    contentDescription = "PARIS",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(bottom = 563.dp)
                )

            }

        }

        Column(
            modifier = Modifier
                .padding(start = 325.dp, top = 10.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.susanna),
                contentDescription = "",
                modifier = Modifier
                    .width(200.dp)
                    .height(60.dp)
            )

            Text(
                text = "Susanna Hoffs",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier
                    .shadow(elevation = 100.dp)

                )

        }

        Column (
            modifier = Modifier
                .padding(top = 140.dp, start = 15.dp)
        ) {
            Row {

                Icon(
                    imageVector = Icons.Default.Place,
                    contentDescription = ""
                )



                Column {
                    Text(
                        text = "You're in Paris",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Text(
                        text = "My Trips",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                }


            }

            Column {
                Text(
                    text = "Categories",
                    color = Color.DarkGray,
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(top = 30.dp)
                )
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(categorias){
                    Column (
                        modifier = Modifier
                            .padding(top = 15.dp)
                    ) {
                        Row {
                            Column (
                                modifier = Modifier
                                    .width(130.dp)
                                    .height(75.dp)
                                    .background(color = Color(0xFFCF06F0))
                                    .padding(start = 40.dp, top = 10.dp)
                            ) {
                                Image(
                                    painter = 
                                    if (it.imagem == null)
                                        painterResource(id = R.drawable.image_not_available)
                                    else
                                        it.imagem!!,
                                    contentDescription = ""
                                )
                                Text(
                                    text = it.categoria,
                                    color = Color.White,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 20.sp
                                )
                            }
                        }

                    }

                    Spacer(modifier = Modifier.width(10.dp))
                }
            }

            Column {
                OutlinedTextField(
                    value = "Search your destiny",
                    onValueChange = {},
                    modifier = Modifier
                        .width(100.dp)
                        .height(50.dp)
                        .background(color = Color.Gray)
                )
            }










        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun TelaHomePreview() {
    TelaHome()
}