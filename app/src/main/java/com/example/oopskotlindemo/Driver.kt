package com.example.oopskotlindemo

import android.util.Log

open class Driver( var name: String) {


    open fun showDetails(){
        Log.i("MyTag","Tha name of the driver is $name")
    }
}