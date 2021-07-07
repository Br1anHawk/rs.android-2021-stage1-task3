package subtask1

import kotlin.math.abs

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        //throw NotImplementedError("Not implemented")
        val comparisonError = 0.000001
        val combinations = array[0]
        val n = array[1]
        var k: Int? = null
        for (i in 1..n) {
            if (abs(c(i, n) - combinations) < comparisonError) {
                k = i
                break
            }
        }
        return k
    }

    private fun c(k: Int, n: Int): Double {
        return factorial(n) / factorial(k) / factorial(n - k)
    }

    private fun factorial(n: Int): Double {
        if (n == 0) return 1.0
        var ans = 1.0
        for (i in 1..n) {
            ans *= i
        }
        return ans
    }
}


