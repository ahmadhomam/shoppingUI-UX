package com.example.shoppingui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridItemScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingui.Data.Demo
import com.example.shoppingui.ui.theme.Darkpurple
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun homeUI() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)){
        Column (modifier = Modifier
            .fillMaxSize()){
           Row (modifier = Modifier
               .fillMaxWidth()
               .background(Darkpurple)){
               button(icon = R.drawable.baseline_search_24)
               Column (modifier = Modifier
                   .fillMaxWidth(0.7f)
                   .padding(0.dp,10.dp,0.dp,0.dp),
                   horizontalAlignment = Alignment.CenterHorizontally){ Text(text = "Myntra",
                   style = TextStyle(fontSize = 24.sp , fontWeight = FontWeight.W700, color = Color.White)
               ) }
               Row(modifier = Modifier.fillMaxWidth(),
                   horizontalArrangement = Arrangement.End) {
                   button(icon = R.drawable.baseline_dehaze_24)
               }
           }
            Card(modifier = Modifier
                .fillMaxWidth(),
                elevation = CardDefaults.elevatedCardElevation(28.dp)) {
                LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                    item (Data.datalist){

                } }
            }
        }
    }
}

@Composable
fun button(tint: Color= Color.White,
           @DrawableRes icon:Int){
IconButton(onClick = {})
{Icon(painter = painterResource(id = icon), contentDescription = null) }
}

@Composable
fun showsuit(
    data: Demo
){Card(shape = RoundedCornerShape(7.dp),modifier = Modifier
    .width(175.dp)
    .height(300.dp)
    .padding(5.dp,5.dp)){
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center){
        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp,5.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter= painterResource(id = data.img), contentDescription = null, modifier = Modifier
                .size(111.dp)
                .clip(CircleShape),
                contentScale = ContentScale.Crop)
            Text(text= data.price,style= TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.W400,
                color = Color.Red
            ), textAlign = TextAlign.Center
            )
            Text(text= data.disp,style= TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.W300,
                textAlign = TextAlign.Center
            )
            )
            Button(onClick = {}, modifier = Modifier
                .width(91.dp),
                shape = RoundedCornerShape(18.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Darkpurple
                )
            ) {
                Text(text = "Add", style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.White
                ),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

}
