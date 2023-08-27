package com.example.airindia

import android.os.Bundle

class Ticket_Model
{
    var uname=""
    var useatno = ""
    var uflightno = ""
    var umobileno = ""
    var upassportno = ""
    var ugender = ""
    var uage = ""
    var udepart = ""
    var uarrival = ""
    var udate = ""
    var udeparttime = ""
    var uarrivaltime = ""
    var uprice = ""
    var uticketno = ""
    var ubookingdate = ""

    constructor(uname:String,useatno:String,uflightno:String,umobileno:String,upassportno:String,ugender:String,
    uage:String,udepart:String,uarrival:String,udate:String,udeparttime:String,uarrivaltime:String,
    uprice:String,uticketno:String,ubookingdate:String)
    {
        this.uname = uname
        this.useatno = useatno
        this.uflightno = uflightno
        this.umobileno = umobileno
        this.upassportno = upassportno
        this.ugender = ugender
        this.uage = uage
        this.udepart = udepart
        this.uarrival = uarrival
        this.udate = udate
        this.udeparttime = udeparttime
        this.uarrivaltime = uarrivaltime
        this.uprice = uprice
        this.uticketno = uticketno
        this.ubookingdate = ubookingdate
    }
}