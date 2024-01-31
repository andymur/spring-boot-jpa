package org.example

import org.example.entity.UserRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import kotlin.test.assertTrue


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DataTest : TestWithDatabase {

    @Autowired
    private lateinit var userRepository: UserRepository

    @Test
    fun `user with root name should exist`() {
        assertTrue { userRepository.findAllByName("root").isNotEmpty() }
    }

}