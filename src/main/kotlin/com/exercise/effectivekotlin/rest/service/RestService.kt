package com.exercise.effectivekotlin.rest.service

import org.springframework.stereotype.Service

@Service
class RestService {
    fun hello(): String {
        return "Hello, Kotlin!"
    }
}
