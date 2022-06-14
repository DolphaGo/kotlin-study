package com.kotlin.study.lambda

import org.junit.jupiter.api.Test

class LambdaTest {

    fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 2 == 0 }

    
    @Test
    fun main() {
        val list = ArrayList<Int>()
        list.add(1)
        println(containsEven(list))
    }
}
