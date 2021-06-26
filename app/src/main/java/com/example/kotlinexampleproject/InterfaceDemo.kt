
package com.example.kotlinexampleproject
fun main(args:Array<String>){
    var myButton=MyButton()
   println(myButton.name)
    myButton.ontouch()
    myButton.onclick()

}
interface MyInterface{//you cant create instance of interface
    var name:String   //properties in interface are abstract by default
    fun ontouch()     //method in interface are abstract by default
    fun onclick(){    //Normal method are public and open by default not final

    }
}
class MyButton:MyInterface{
    override var name: String="suman"

    override fun ontouch() {
        println("ontouch")
    }

    override fun onclick() {
        super.onclick()
        println("onclick")
    }

}