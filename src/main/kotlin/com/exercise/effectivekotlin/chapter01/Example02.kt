package com.exercise.effectivekotlin.chapter01

class Example02 {
    var name: String = "Marcin"
    var surName: String = "Moskaja"
    val fullName
        get() = "$name $surName" // 호출 될 때 문자열 재생성
    // A 'val'-property cannot have a setter
}

fun main() {
    val ex02 = Example02()
    val a = 10
    // a = 20 // compile error: Val cannot be reassigned
    val list = mutableListOf(1, 2, 3)
    list.add(4) // val can be mutated
    // list = mutableListOf(5, 6, 7, 8) // compile error: Val cannot be reassigned
    println(ex02.fullName) // Marcin Moskaja
    ex02.name = "Maja"
    // val can be changed
    println(ex02.fullName) // Maja Moskaja
}
