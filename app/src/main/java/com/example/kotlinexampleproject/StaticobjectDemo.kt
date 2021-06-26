package com.example.kotlinexampleproject

fun main(args:Array<String>){
    Customerdata.count=24
    Customerdata.typeofcustomer()
    println(Customerdata.count)
    Customerdata.count=98

    println(Customerdata.typeofcustomer())
    println(Customerdata.count)
    println(Customerdata.mymethod("hello"))


}
open class Mysuperclass{
   open fun mymethod(str:String){
       println("super method")

    }
}
object Customerdata:Mysuperclass(){
    var count:Int=-1// Behave like static variable
    fun typeofcustomer():String{// Behave like static method
        return "Indian"
    }

    override fun mymethod(str: String) {//Currently ,behaving like static method
        super.mymethod(str)
        println("my method:"+str)
    }
    init {
        println("your customer data")

    }
}
