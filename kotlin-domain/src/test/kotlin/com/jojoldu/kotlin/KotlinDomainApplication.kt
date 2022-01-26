package com.jojoldu.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDomainApplication {
    fun main(args: Array<String>) {
        runApplication<KotlinDomainApplication>(*args)
    }

}
