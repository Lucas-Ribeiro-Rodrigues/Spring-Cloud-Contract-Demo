package com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.model

import java.util.UUID

data class DemoDTO(
    val uuid: UUID,
    val name: String,
    val fruits: List<String>,
    val movies: List<String>
)