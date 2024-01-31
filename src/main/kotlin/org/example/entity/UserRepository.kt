package org.example.entity

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findAllByName(name: String): List<User>
}
