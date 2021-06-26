package com.example.kotlinexampleproject
fun main(args:Array<String>){
    val lazyDemo:LazyDemo by lazy { LazyDemo("ani",23) }
    println(lazyDemo.toString())

}

class LazyDemo(val name:String,val age:Int) {
    init {
        println("The name is ${name}")
        println("The age is ${age}")
    }

}