package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(start = 230.dp)
                .background(color = Color.Magenta)
        ) {
        }

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(bottom = 350.dp, start = 20.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Login",
                color = Color.Magenta,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 45.sp,
                modifier = Modifier


            )
            Text(
                text = "Please sign in to continue.",
                color = Color.Gray,
                fontSize = 15.sp,
                modifier = Modifier

            )
        }

    }

    Column (
        modifier = Modifier
            .padding(top = 360.dp, start = 55.dp),
    ) {
        OutlinedTextField(
            value = "teste@gmail.com",
            onValueChange = {},
            label = {
                Text(text = "E-mail")
            }
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = "*********",
            onValueChange = {},
            label = {
                Text(text = "Password")
            }
        )

        Spacer(modifier = Modifier.height(25.dp))

        Button(
            onClick = {},

            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp, end = 50.dp)
        ) {
            Text(text = "SIGN IN", fontWeight = FontWeight.ExtraBold, fontSize = 19.sp)
        }

        Column (
        ){
            Row {
                Text(
                    text = "Don't have an account?",
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(start = 45.dp, top = 10.dp)
                )
                Text(
                    text = "Sign up",
                    color = Color.Magenta,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                )
            }
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TripRoomTheme {
        Greeting()
    }
}