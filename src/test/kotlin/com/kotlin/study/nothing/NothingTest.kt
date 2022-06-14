package com.kotlin.study.nothing
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class NothingTest {

    fun failWithWrongAge(age: Int?): Nothing {
        throw IllegalArgumentException("Wrong age: $age")
    }

    fun checkAge(age: Int?) {
        if (age == null || age !in 0..150) failWithWrongAge(age)
        println("Congrats! Next year you'll be ${age + 1}.")
    }

    @Test
    fun main() {
        checkAge(10)
    }

}
