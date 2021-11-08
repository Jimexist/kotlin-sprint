package me.jiayu.kotlinsprint

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val service: UserService) {

    @GetMapping
    fun index(): List<User> = service.findUsers()

    @PostMapping
    fun create(@RequestBody user: User) = service.saveUser(user)

}