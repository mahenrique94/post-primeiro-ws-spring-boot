package br.com.matheuscastiglioni.primeirows

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrimeiroWsApplication

fun main(args: Array<String>) {
    runApplication<PrimeiroWsApplication>(*args)
}
