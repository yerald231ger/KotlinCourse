package com.example.helloworld.training

class Yorkie(size: Int, colors: String, name: String)
    : Canin("Yorkie", name)  {
    override fun bark() : String = "Barking like yorkie..."
}