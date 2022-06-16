package com.kotlin.study.algorithm

import org.junit.jupiter.api.Test

class Algorithm {

    @Test
    fun test() {
        val nums = intArrayOf(3, 2, 2, 3)
        val `val` = 3
        print(removeElement(nums, `val`))
        nums.toList().stream().forEach { print(it) }
    }

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[count++] = nums[i]
            }
        }
        return count
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null || q == null) return p == q
        return p.`val` == q.`val` && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }

    fun Int.r(): RationalNumber = RationalNumber(this, 1)

    fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

    data class RationalNumber(val numerator: Int, val denominator: Int)

    @Test
    fun extension_functions() {
        val rationalNumber = RationalNumber(12, 2)
        val r = rationalNumber.denominator.r()
        println(r)

        val pair = Pair(36, 6)
        println(pair.r().numerator)
        println(pair.r().denominator)
    }
}
