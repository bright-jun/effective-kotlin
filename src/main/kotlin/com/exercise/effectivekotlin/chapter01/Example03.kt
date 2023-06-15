package com.exercise.effectivekotlin.chapter01

interface Element {
    val active: Boolean
}

class ActualElement : Element {
    private var activeValue: Boolean = false

    // override val to var
    override var active: Boolean
        get() = activeValue
        set(value: Boolean) {
            activeValue = value
        }
}

fun main() {
    val element: Element = ActualElement()
    println(element.active) // false
    // element.active = true // compile error: Val cannot be reassigned

    val actualElement: ActualElement = ActualElement()
    println(actualElement.active) // false
    actualElement.active = true
    println(actualElement.active) // true
}
