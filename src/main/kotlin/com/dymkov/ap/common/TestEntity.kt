package com.dymkov.ap.common

import com.dymkov.ap.lib.annot.IgnoreResponse
import java.time.LocalDateTime

data class TestEntity(

    val message: String,

    @IgnoreResponse
    val timestamp: LocalDateTime
)