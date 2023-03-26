package com.tiburcio.users.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class AppController {

    @GetMapping
    fun app() = ResponseEntity.noContent().build<Void>()
}
