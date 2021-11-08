package me.jiayu.kotlinsprint

import org.springframework.stereotype.Service

@Service
class UserService(private val repo: UserRepo) {

    fun findUsers(): List<User> = repo.findAllUsers()

    fun saveUser(user: User) {
        repo.save(user)
    }
}