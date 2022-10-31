package com.dymkov.ap.endpoints

import com.dymkov.ap.lib.Response
import com.dymkov.ap.service.test.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestEndpoint {

    @GetMapping("/hello")
    @ResponseBody
    fun hello(): Response<*> {
        return TestService::craeteTest.call()
    }
}