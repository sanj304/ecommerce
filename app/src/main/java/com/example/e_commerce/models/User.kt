package com.example.e_commerce.models

class User {
        var firstname:String=""
        var lastname:String=""
        var email:String=""
        var password:String=""
        var userid:String=""
        constructor(firstname:String,lastname:String,
                    email:String,password:String,userid:String){
            this.firstname=firstname
            this.lastname=lastname
            this.email=email
            this.password=password
            this.userid=userid
        }
        constructor()
    }
