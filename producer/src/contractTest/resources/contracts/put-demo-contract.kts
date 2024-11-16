import org.springframework.cloud.contract.spec.ContractDsl.Companion.contract

contract {
    request {
        method = PUT
        url = url("/api/v1/demo")
        body = body("""
            {
                "uuid": "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "name": "Demo Entity 3",
                "fruits": [
                    "Orange", "Lemon"
                ],
                "movies": [
                    "Friday the 13th", "Nightmare on Elm Street", "Halloween"
                ],
                "status": "UPDATED"
            }
        """.trimIndent())
        headers {
            contentType = "application/json"
        }
    }
    response {
        status = OK
        body = body("""
            {
                "uuid": "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "name": "Demo Entity 3",
                "fruits": [
                    "Orange", "Lemon"
                ],
                "movies": [
                    "Friday the 13th", "Nightmare on Elm Street", "Halloween"
                ],
                "status": "UPDATED"
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