package com.example.kotlinexampleproject

class Scopefunction {
    var name:String="Animesh"
    var age:Int=26

}
fun main(args:Array<String>){
    //scope function:with
    //property1:refer to context object using this
    //property2:the return value is the lamda result
    val scopefunction=Scopefunction()
   val ageafterfiveyear:Int= with(scopefunction){
        println(name)
        println(age)
        age+5

    }
    println("ageafterfiveyear$ageafterfiveyear")

    //scope function :apply
    //property1:refer to context object using this
    //property2:the return value is the context object
    val scopefunction1=Scopefunction().apply {
        name="ani"
        age=30
    }
    with(scopefunction1){
        println(name)
        println(age)
    }
    //perform some other operation on 'person' object
     scopefunction1.also {
         it.name = "suman"
         println("the new name${it.name}")
     }
    //scope function:let
    //property1:refer to context object by using it
    //property2:return value is the lambda result
    //use let function to avoid null pointer exception
     val name:String?="Hello"
    val stringlength=name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }
    println(stringlength)
    //scope function:run
    //property1:refer to context object by using this
    //property2:the retrun value is the lamda result
    //run is combination of  with and let
    //if you want to operate on a nullable object and avoid nullpointerexception then use 'run'
    val scopefunction2:Scopefunction?=Scopefunction()
   val afterfiveyearage= scopefunction2?.run {
        println(name)
        println(age)
        age +5
    }
    println("ageafterfiveyear$afterfiveyearage")






}