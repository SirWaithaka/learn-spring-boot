package com.example.me

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

val menu = """
    
""".trimIndent()

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/hello-service")
    fun helloKotlinService(): String {
        return helloService.getHello()
    }

    @GetMapping("/world/hello")
    fun helloWorld(): Entity {
        return helloService.getObject()
    }
}