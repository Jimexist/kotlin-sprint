package me.jiayu.kotlinsprint

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface UserRepo : CrudRepository<User, Int> {

    @Query("SELECT id, name FROM users")
    fun findAllUsers(): List<User>

}