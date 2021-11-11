package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.QueryValue
import io.micronaut.runtime.Micronaut.build
import java.util.*

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.example")
        .start()
}

@Controller("/")
class HelloController {

    @Get("/{key}{?ui}")
    fun show(key: String, ui: Optional<String>): String {
        return "Hello World"
    }

    @Post("{?ui}")
    fun create(@QueryValue("ui") ui: Optional<String>): String {
        return "Hello World"
    }
}

