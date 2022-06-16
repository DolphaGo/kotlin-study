package com.kotlin.study.override

import org.junit.jupiter.api.Test

class OverrideTest {
    data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
        override fun compareTo(other: MyDate) = when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }

    }

    fun compareTest(date1: MyDate, date2: MyDate) {
        // this code should compile:
        println(date1 < date2)
    }

    @Test
    fun test() {
        compareTest(MyDate(2021, 1, 12), MyDate(2022, 5, 22));
    }
}
