package com.example.shoppingui

import androidx.annotation.DrawableRes

object Data {
    class Demo(
        @DrawableRes var img:Int,
        var name:String,
        var disp:String,
        var price:String
    )

    var datalist = listOf(
        Demo(
            img = R.drawable.img2,
            name = "Vintage Suit",
            disp = "the best suit available in the market",
            price = "$40"
        ),
        Demo(
            img = R.drawable.images,
            name = "Vintage Suit",
            disp = "the best suit available in the market",
            price = "$40"
        ),Demo(
            img = R.drawable.img2,
            name = "Vintage Suit",
            disp = "the best suit available in the market",
            price = "$40"
        ),
        Demo(
            img = R.drawable.images,
            name = "Vintage Suit",
            disp = "the best suit available in the market",
            price = "$40"
        ),
        Demo(
            img = R.drawable.img2,
            name = "Vintage Suit",
            disp = "the best suit available in the market",
            price = "$40"
        ),
        Demo(
            img = R.drawable.images,
            name = "Vintage Suit",
            disp = "the best suit available in the market",
            price = "$40"
        ),
        Demo(
            img = R.drawable.img2,
            name = "Vintage Suit",
            disp = "the best suit available in the market",
            price = "$40"
        ),
        Demo(
            img = R.drawable.images
            ,
            name = "Vintage Suit",
            disp = "the best suit available in the market",
            price = "$40"
        )
    )

}