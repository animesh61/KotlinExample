package com.example.kotlinexampleproject
fun main(args:Array<String>){
    val lateintDemo=LateintDemo()
   lateintDemo.name="India"
    println("The country name${lateintDemo.name}")
    lateintDemo.setup()



}

class LateintDemo {
    lateinit var name:String
    fun setup(){
        name="usa"
        println("The country name${name}")
    }

}