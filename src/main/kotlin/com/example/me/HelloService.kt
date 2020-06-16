package com.example.me

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun getHello(): String {
        return "Hello world"
    }

    fun getObject(): Entity {
        return Entity("hello", "world")
    }
}