package com.example.drealtor.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.drealtor.utils.Screens

@Composable()
fun Home(navController: NavHostController) {
    var items =
        listOf<String>("House", "Apartment", "Condos", "Hotels", "Palace", "Commercial House")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    )
    {
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            itemsIndexed(items) { index, item ->
                CategoryCard(title = item)

            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        LazyRow {
            items(10) {
                Box(
                    modifier = Modifier
                        .clickable {
                            navController.navigate(Screens.DetailsScreen.route)
                        }
                        .height(200.dp)
                        .width(200.dp)
                        .padding(3.dp, 0.dp)
                ) {
                    ImageCard(
                        modifier = Modifier,
                        desc = "Car",
                        title = "Awesome Car"
                    )
                }

            }
        }

    }

}

@Composable
fun ImageCard(
    modifier: Modifier = Modifier,
    desc: String,
    title: String
) {
    Card(
        modifier = modifier.height(200.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        shape = RoundedCornerShape(5.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {

//            Image(
//                 painter = painterResource(id = R.drawable.car),
//                contentDescription = desc,
//                contentScale = ContentScale.Crop
//            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            startY = 120f,
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            )
                        )
                    )
            )
        }

    }
}

@Composable
fun CategoryCard(title: String) {
    Text(
        modifier = Modifier
            .clickable { }
            .padding(10.dp, 0.dp)
            .background(color = Color.Gray, shape = RoundedCornerShape(30.dp))
            .padding(20.dp, 5.dp),
        text = title,
        color = Color.White
    )
}

@Composable
@Preview(showBackground = true)
fun previewApp() {
    Home(navController = rememberNavController())
}