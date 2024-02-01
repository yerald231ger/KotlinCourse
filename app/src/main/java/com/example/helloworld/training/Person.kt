package com.example.helloworld.training

class Person  {

    var name : String = ""

    constructor(name: String){
        this.name = name
    }

    fun useTv(){
        println("$name is ${Tv.usingTv()}")
    }
}