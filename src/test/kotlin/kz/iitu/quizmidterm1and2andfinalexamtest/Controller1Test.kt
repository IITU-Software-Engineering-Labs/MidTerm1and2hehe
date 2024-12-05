package kz.iitu.quizmidterm1and2andfinalexamtest

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.assertj.core.api.Assertions.assertThat
import org.springframework.boot.test.web.server.LocalServerPort

/**
 * Task Description:
 *
 * 1. Create a REST controller that:
 *    - Handles HTTP GET requests at the `/api/hello` endpoint.
 *    - Returns a response: "Hello, Spring from Controller1!".
 * 2. Ensure the controller is simple and follows clean code principles.
 *
 * run this command ./gradlew test --tests "kz.iitu.quizmidterm1and2andfinalexamtest.Controller1Test"
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Controller1Test {

    @LocalServerPort
    private var port: Int = 0

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    fun `Test hello endpoint returns expected response`() {
        val url = "http://localhost:$port/api/hello"
        val response = restTemplate.getForObject(url, String::class.java)
        assertThat(response).isEqualTo("Hello, Spring from Controller1!")
    }
}
