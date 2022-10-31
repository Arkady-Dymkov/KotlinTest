package com.dymkov.ap.service.test

import com.dymkov.ap.common.TestEntity
import com.dymkov.ap.lib.Response
import java.time.LocalDateTime

object TestService {

    fun craeteTest(): Response<TestEntity> {
        with(
            TestEntity("Hello World", LocalDateTime.now())
        ) {
            return Response<TestEntity>().map(this)
        }
    }

}