
package com.example.kotlinexampleproject

fun main(args:Array<String>){
    Myclass.count=23
    Myclass.typeofcustomer()
    println(Myclass.count)
    println(Myclass.typeofcustomer())
    Myclass.count=46
    println(Myclass.count)

}
class Myclass{
    companion object{
        var count:Int=-1
        fun typeofcustomer():String{
           return "Indian"
        }
    }
}