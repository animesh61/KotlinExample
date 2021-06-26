package com.example.kotlinexampleproject
fun main(args:Array<String>) {

    var dog=Dog()
    dog.breed="labra"
    dog.color="black"
    dog.bark()
    dog.eat()

    var cat=Cat()
    cat.age=10
    cat.color="brown"
    cat.meaw()
    cat.eat()


    var animal=Animal()
    animal.color="white"
    animal.eat()


}
open class Animal{
    var color:String=""
    fun eat(){
        println("Eat")
    }

}


class Dog:Animal() {
    var breed:String=""
    fun bark(){
        println("Bark")
    }

}
class Cat:Animal(){
    var age:Int=-1
    fun meaw(){
        println("Meow")
    }
}