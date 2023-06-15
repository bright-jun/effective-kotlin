package com.exercise.effectivekotlin.chapter01

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class Example01 {

    fun thread01() {
        var num = 0
        for (i in 1..1000) {
            thread {
                Thread.sleep(10)
                num += 1
            }
        }
        Thread.sleep(5000)
        println(num) // is not 1000
    }

    suspend fun thread02() {
        var num = 0
        coroutineScope {
            for (i in 1..1000) {
                launch {
                    delay(10)
                    num += 1
                }
            }
        }
        println(num) // is not 1000
    }

    fun thread03() {
        val lock = Any()
        var num = 0
        for (i in 1..1000) {
            thread {
                Thread.sleep(10)
                synchronized(lock) {
                    num += 1
                }
            }
        }
        Thread.sleep(1000)
        println(num) // is 1000
    }
}

suspend fun main() {
    val ex01 = Example01()
    ex01.thread01()
    ex01.thread02()
    ex01.thread03()
}
