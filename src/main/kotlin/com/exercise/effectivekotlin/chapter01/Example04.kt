package com.exercise.effectivekotlin.chapter01

class Example04 {
    val name: String? = "Marton"
    val surName: String = "Braun"

    val fullName: String?
        get() = name?.let { "$it $surName" }

    val fullName2: String? = name?.let { "$it $surName" }
}

fun main() {
    val ex04 = Example04()
    if (ex04.fullName != null) {
        // println(ex04.fullName.length)
        // Smart cast to 'String' is impossible, because 'ex04.fullName' is a property that has open or custom getter
    }

    if (ex04.fullName2 != null) {
        println(ex04.fullName2.length) // Smart cast to 'String'
    }
}
