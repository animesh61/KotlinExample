
package com.example.kotlinexampleproject

 object  Singleton {
     init {
         println("Singleton class invoked.")
     }
     var variableName = "I am Var"
     fun printVarName(){
         println(variableName)
     }
     class A {

         init {
             println("Class init method. Singleton variableName property : ${Singleton.variableName}")
             Singleton.printVarName()
         }
     }

 }