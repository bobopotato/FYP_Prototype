package com.example.fyp_prototype.Model

class Review(val reviewID:String,val reviewContent:String,val reviewDateTime:String,val numStar:Double,val propertyID:String,val userID:String) {
    constructor():this("","","",0.0,"","")
}