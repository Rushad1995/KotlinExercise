package com.exercise.client

import com.exercise.hello.sayHi

fun getName (){
    println("Enter a client name")
    var clientName = readLine()?:""
    sayHi(clientName)
}