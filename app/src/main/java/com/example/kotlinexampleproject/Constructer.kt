package com.example.kotlinexampleproject

//primary
fun main(args:Array<String>){
    var human=Human("Animesh",10)
    human.think()

}

class Human(var n:String){
    var name:String=n
    var age:Int=-1
    //secondary
    constructor(name:String,age:Int):this(name){
       this.age=age
   }
    fun think(){
     println("My name is $n")
     println("My age is $age")
    }
}