package br.com.matheuscastiglioni.primeirows

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PrimeiroWsController {

    @GetMapping
    fun index() : ResponseEntity<String> {
        return ResponseEntity.ok("Hello World")
    }

}