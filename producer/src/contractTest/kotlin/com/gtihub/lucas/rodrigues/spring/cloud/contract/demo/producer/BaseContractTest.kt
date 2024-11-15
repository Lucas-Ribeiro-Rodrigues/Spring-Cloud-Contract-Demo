package com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer

import com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.controller.DemoController
import com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.model.DemoDTO
import com.gtihub.lucas.rodrigues.spring.cloud.contract.demo.producer.service.DemoService
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import java.util.UUID

@ExtendWith(MockitoExtension::class)
open class BaseContractTest {

    @Mock
    private lateinit var demoService: DemoService

    @BeforeEach
    fun beforeEach() {
        RestAssuredMockMvc.standaloneSetup(DemoController(demoService))

        val uuid = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479")
        Mockito.`when`(demoService.getDemo()).thenReturn(DemoDTO(uuid,
            "mockedName",
            listOf("Apple", "Banana", "Cashew"),
            listOf("Poor Things", "Schindler's list", "Kung Fu Panda")
        ))
    }
}