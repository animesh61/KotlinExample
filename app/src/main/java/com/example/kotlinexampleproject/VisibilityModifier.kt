package com.example.kotlinexampleproject

fun main(args:Array<String>){
    val indian=Indian()
    indian.test()
    val test=Test()
    test.testing()
}
class Test{
    fun testing(){
        val person=Person()
        println(person.c)
        println(person.d)
    }
}


open class Person{
    private val a=1
    protected val b=2
    internal val c=4
     public val d=10


}

class Indian:Person(){
    fun test(){
      println(d)
        println(c)
        println(b)
      //  println(a)
    }
}
