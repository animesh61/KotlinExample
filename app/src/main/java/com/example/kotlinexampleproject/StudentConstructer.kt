
package com.example.kotlinexampleproject


fun main(args:Array<String>){

    var student=Student("Animesh",10)
    println("My id is${student.id}")
    println("My name is ${student.name}")

}
class Student (var name:String) {
    var id:Int=-1

    init {
       println("My name is ${name}")
    }
    constructor( n:String,id:Int):this(n){
        this.id=id


    }
}