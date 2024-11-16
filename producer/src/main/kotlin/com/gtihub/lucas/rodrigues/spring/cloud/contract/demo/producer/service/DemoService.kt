package com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.service

import com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.model.DemoDTO
import org.springframework.stereotype.Service
import java.util.*

@Service
class DemoService {

    fun getDemo() = DemoDTO(
        UUID.randomUUID(),
        "Demo Entity 1",
        listOf("Apple", "Banana"),
        listOf("Lord of the rings", "Schindler's list", "Poor things")
    )

    fun postDemo() = DemoDTO(
        UUID.randomUUID(),
        "Demo Entity 2",
        listOf("Grape", "Guava"),
        listOf("Spider Man 1", "Batman", "Joker")
    )

    fun putDemo() = DemoDTO(
        UUID.randomUUID(),
        "Demo Entity 3",
        listOf("Orange", "Lemon"),
        listOf("Friday the 13th", "Nightmare on Elm Street", "Halloween")
    )

    fun deleteDemo(uuid: UUID) {}
}