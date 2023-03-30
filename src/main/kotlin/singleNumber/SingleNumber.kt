package singleNumber

//https://leetcode.com/problems/single-number/solutions/3113279/one-line-solution/?languageTags=kotlin
class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        return nums.reduce { prev, curr ->
            prev xor curr
        }
    }
}