package com.example.mongo.spring_mongo.shared

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringMongoApplication

fun main(args: Array<String>) {
  runApplication<SpringMongoApplication>(*args)
}
