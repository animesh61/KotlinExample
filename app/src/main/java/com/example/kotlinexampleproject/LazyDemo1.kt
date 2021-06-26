
package com.example.kotlinexampleproject

class LazyDemo1 {
    private val heavyobject:LazyDemo1 by lazy {
        println("Heavy object initilized")
        LazyDemo1()
    }
    fun accessobject(){
        println(heavyobject)
    }
    //Now, the benefit of using lazy is that the object will be created only when it is called otherwise it will not be created.
    //
    //The other benefit of using lazy is that once the object is initialized, you will use the same object again when called.
}
fun main(args:Array<String>){
    val lazyDemo=LazyDemo1()
    println("someclass inilized")
    lazyDemo.accessobject()
    lazyDemo.accessobject()
}