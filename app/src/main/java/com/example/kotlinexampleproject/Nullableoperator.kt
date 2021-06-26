package com.example.kotlinexampleproject
fun main(args:Array<String>){
    val name:String?="animesh"
    //safe call(?.)
    //Returnes the length if 'name' is not null else return null
    //use it if you dont mind getting Null value
    println("The length of the name is${name?.length}")

    //safe call with let(?.let)
    //it execute the block only if name is NOT NULL
    name?.let {
        println("The length of the name is${name.length}")

    }
    // Elvis operator(?:)
    //when we have nullable reference 'name',we can say "is name is not null",use it,
    //otherwise use some non null value"
    val length=name?.length?:-1
    println("The length of the name is${length}")
    //Non nul assertion operator(!!)
    //USE it when you are sure the value is not null otherwise throws nullpoiner expection
    println("The length of the name is${name!!.length}")


}

class Nullableoperator {
}