package com.example.drealtor.utils

 sealed class Screens(var route:String) {
     object  Home:Screens(route = "home");
     object  DetailsScreen:Screens(route = "details");

}