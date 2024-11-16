package com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.controller

import com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.model.DemoDTO
import com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.service.DemoService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/api/v1/demo")
class DemoController(
    private val demoService: DemoService
) {

    @GetMapping
    fun getDemo(): DemoDTO {
        return demoService.getDemo()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun postDemo(@RequestBody demoDTO: DemoDTO): DemoDTO {
        return demoService.postDemo()
    }

    @PutMapping
    fun putDemo(@RequestBody demoDTO: DemoDTO): DemoDTO {
        return demoService.putDemo()
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteDemo(@PathVariable("id") id: UUID) {
        demoService.deleteDemo(id)
    }
}