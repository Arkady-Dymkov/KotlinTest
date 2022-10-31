package com.dymkov.ap.lib

import com.dymkov.ap.lib.annot.IgnoreResponse
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotation

class Response<T : Any> : HashMap<String, Any?>() {

    fun map(entity: T): Response<T> {
        for (field in entity::class.declaredMemberProperties) {
            val fieldGetter = field.getter
            if (fieldGetter.findAnnotation<IgnoreResponse>() != null) {
                this[field.name] = field.getter.call(entity)
            }
        }
        return this
    }

}