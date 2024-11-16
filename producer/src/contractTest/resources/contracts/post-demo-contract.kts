import org.springframework.cloud.contract.spec.ContractDsl.Companion.contract

contract {
    request {
        method = POST
        url = url("/api/v1/demo")
        body = body("""
            {
                "uuid": "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "name": "Demo Entity 2",
                "fruits": [
                    "Grape", "Guava"
                ],
                "movies": [
                    "Spider Man 1", "Batman", "Joker"
                ],
                "status": "CREATED"
            }
        """.trimIndent())
        headers {
            contentType = "application/json"
        }
    }
    response {
        status = CREATED
        body = body("""
            {
                "uuid": "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "name": "Demo Entity 2",
                "fruits": [
                    "Grape", "Guava"
                ],
                "movies": [
                    "Spider Man 1", "Batman", "Joker"
                ],
                "status": "CREATED"
            }
        """.trimIndent())
        bodyMatchers {
            jsonPath("$.uuid", byRegex("[0-9a-fA-F-]{36}"))  // Qualquer UUID válido
        }
        headers {
            contentType = "application/json"
        }
    }
}