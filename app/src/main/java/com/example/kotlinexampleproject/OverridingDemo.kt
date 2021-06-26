package com.example.kotlinexampleproject

import android.graphics.Color

fun main(args:Array<String>){
    var dog1=Dog1()
    dog1.eat()
    dog1.bark()
    println(dog1.color)
    var cat1=Cat1()
    cat1.eat()
    var animal1=Animal1()
    animal1.eat()

}

open class Animal1{
   open var color:String="white"
   open fun eat(){
        println("Animal eating")
    }
    open fun bark(){
        println("Animal bark")
    }


}


class Dog1:Animal1() {
    var breed:String=""
   override var color:String="Brown"
    override fun bark(){
        println("Dog Bark")
    }
   override fun eat(){
       super.eat()
        println("Dog is eating")
    }

}
class Cat1:Animal1(){
    var age:Int=-1
    fun meaw(){
        println("Meow")
    }
    override fun eat(){
        super.eat()
        println("cat is eating")
    }

}
