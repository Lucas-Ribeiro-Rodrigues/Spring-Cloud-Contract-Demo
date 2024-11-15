package com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.controller

import com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.model.DemoDTO
import com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.service.DemoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/demo")
class DemoController(
    private val demoService: DemoService
) {

    @GetMapping
    fun getDemo(): DemoDTO {
        return demoService.getDemo()
    }

}