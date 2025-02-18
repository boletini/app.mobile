package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreen (modifier:  Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.verticalGradient(
                listOf(Color.Red, Color.Magenta)
            )
            )
    ){
       Column (
           modifier = Modifier
               .fillMaxSize(),
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.SpaceAround

       ){ Image(
               painter = painterResource(R.drawable.exercicio),
               contentDescription = stringResource(R.string.Your_name),
               modifier = Modifier
                   .padding(vertical = 60.dp)

           )
           Text(
               text = stringResource(R.string.Welcome),
               fontSize = 32.sp,
               color = Color.DarkGray,
               modifier = Modifier
                   .padding(bottom = 68.dp)
           )
           Card (
               modifier = Modifier
                   .fillMaxSize()
                   .height(100.dp),
               shape = RoundedCornerShape(
                   topStart = 48.dp,
                   topEnd = 48.dp
               )
           ){
               Column (
                    modifier = Modifier
                            .fillMaxSize(),

               )
               {Column (
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .padding(start = 30.dp)

               ){
               }
                   Text(
                       text = stringResource(R.string.Your_name),
                       fontSize = 32.sp,
                       modifier = Modifier

               }
               OutlinedTextField(
                   value = "",
                   onValueChange = { },
                   label = {
                       Text(text = "Digite o seu nome.")

                   }


               )

           }

       }

    }
}


@Preview (showSystemUi = true)
@Composable
private fun HomeScreenPreview () {
    HomeScreen()
}