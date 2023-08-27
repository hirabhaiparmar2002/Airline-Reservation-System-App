package com.example.airindia

class User_Model {

    var name = ""
    var email = ""
    var mobileno = ""
    var address = ""
    var gender = ""
    var qualification = ""
    var age = ""
    var fathername = ""
    var dob = ""
    var password = ""
    var confirmpassword = ""
    var role=""

    constructor(name:String,email:String,mobileno:String,address:String,gender:String,qualification:String,
    age:String,fathername:String,dob:String,password:String,confirmpassword:String,role:String)
    {
        this.name = name
        this.email = email
        this.mobileno = mobileno
        this.address = address
        this.gender = gender
        this.qualification=qualification
        this.age=age
        this.fathername=fathername
        this.dob=dob
        this.password = password
        this.confirmpassword = confirmpassword
        this.role= role
    }

}