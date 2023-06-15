package com.exercise.effectivekotlin.rest.controller

import com.exercise.effectivekotlin.rest.service.RestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController(
    val restService: RestService
) {

    @GetMapping("/hello")
    fun hello(): String {
        return restService.hello()
    }
}
