

package com.example.kotlinexampleproject
fun main(args: Array<String>){
    var indian=Indian1()
   println(indian.name)
    println(indian.eat())
    println(indian.getheight())
}

abstract class Person1 {
    abstract var name:String
    abstract fun eat()
    open fun getheight(){
     println("super height")

    }

}
class Indian1:Person1(){
    override var name: String="animesh"
    override fun eat() {
        println("indian eating")
    }

    override fun getheight() {
        super.getheight()
        println("indin height")
    }

}