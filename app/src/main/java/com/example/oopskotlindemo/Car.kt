package com.example.oopskotlindemo

import android.util.Log

class Car(name: String, override var dance: String) : Driver(name),PenInterface {

    fun start(){
        Log.i("MyTag","The car is starting...")
    }

    override fun showDetails() {
        Log.i("MyTag","lets try $name")
    }

    override fun draw() {
        Log.i("MyTag","dance $dance")


    }

    override fun play() {
        Log.i("MyTag","play $dance")

    }
}