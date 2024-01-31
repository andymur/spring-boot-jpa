package org.example

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
class DataTestWithServiceConnection {

    companion object {
        @Container
        @ServiceConnection
        val postgres: PostgreSQLContainer<Nothing> = PostgreSQLContainer<Nothing>(
            "postgres:15-alpine"
        )
    }

    @Test
    fun `test should launch`() {

    }
}