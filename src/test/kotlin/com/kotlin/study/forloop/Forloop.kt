package com.kotlin.study.forloop

class Forloop {

    data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
        override fun compareTo(other: MyDate) = when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }

    }

    class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
        override fun iterator() : Iterator<MyDate> {
            return object : Iterator<MyDate> {
                var current : MyDate = start

                override fun next(): MyDate {
                    if (!hasNext()) throw NoSuchElementException()
                    val result = current
//                    current = current.followingDate()
                    return result
                }

                override fun hasNext(): Boolean = current <= end
            }
        }
    }

    fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
        for (date in firstDate..secondDate) {
            handler(date)
        }
    }
}
