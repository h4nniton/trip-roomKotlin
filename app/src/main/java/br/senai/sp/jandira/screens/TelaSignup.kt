package br.senai.sp.jandira.screens

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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaSignup() {

    Surface (
        modifier = Modifier.fillMaxSize()
    ) {

        Column {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(start = 230.dp)
                    .background(color = Color(0xFFCF06F0)),
            ) {
            }
        }

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(bottom = 9.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign up",
                color = Color(0xFFCF06F0),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 45.sp,
                modifier = Modifier


            )
            Text(
                text = "Create a new acccout.",
                color = Color.Gray,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(50.dp))

            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(
                    value = "Susana Hoffs",
                    onValueChange = {},
                    label = { Text(text = "Username")}
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = "11 999998888",
                    onValueChange = {},
                    label = { Text(text = "Phone")}
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = "susanninha@hoffs",
                    onValueChange = {},
                    label = { Text(text = "E-mail")}
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = "*******",
                    onValueChange = {},
                    label = { Text(text = "Password")}
                )

                Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Over 18?",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(end = 215.dp)
                    )

                Spacer(modifier = Modifier.height(20.dp))

                Button( onClick = { /*TODO*/ }) {
                    Text(
                        text = "CREATE ACCOUNT",
                        modifier = Modifier
                            .width(240.dp)
                            .padding(start = 50.dp)

                    )
                }

                Column {
                    Row {
                        Text(
                            text = "Already have an account?",
                            color = Color.Gray,
                            modifier = Modifier
                                .padding(start = 85.dp, top = 10.dp)
                        )
                        Text(
                            text = "Sign in",
                            color = Color(0xFFCF06F0),
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(start = 5.dp, top = 10.dp)
                        )
                    }
                }

            }

    }

    }
    
}

@Preview(showSystemUi = true)
@Composable
fun TelaSignupPreview() {
    TelaSignup()
}