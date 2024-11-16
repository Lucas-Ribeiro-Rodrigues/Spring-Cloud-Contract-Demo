import org.springframework.cloud.contract.spec.ContractDsl.Companion.contract

contract {
    request {
        method = GET
        url = url("/api/v1/demo")
    }
    response {
        status = OK
        body = body("""
            {
                "uuid": "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "name": "mockedName",
                "fruits": [
                    "Apple", "Banana", "Cashew"
                ],
                "movies": [
                    "Poor Things", "Schindler's list", "Kung Fu Panda"
                ]
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