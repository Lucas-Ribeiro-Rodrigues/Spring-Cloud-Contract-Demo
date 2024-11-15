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

}