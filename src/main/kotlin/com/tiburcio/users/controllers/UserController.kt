package com.tiburcio.users.controllers

import com.tiburcio.users.models.responses.UserResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @GetMapping
    fun getUsers() : ResponseEntity<List<UserResponse>> {
        val user = UserResponse("guilherme", "guilherme@email.com")
        return ResponseEntity.ok(listOf(user))
    }
}
