package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        //throw NotImplementedError("Not implemented")
        val array = decompose(number * number, number - 1)
        array?.forEach { print("$it ") }
        println()
        return array
    }

    private fun decompose(sqrOfN: Int, checkingNumber: Int): Array<Int>? {
        for (x in checkingNumber downTo 1) {
            val sqrOfCheckingNumber = x * x
            val sqrNewN = sqrOfN - sqrOfCheckingNumber
            val newN = sqrt(sqrNewN.toDouble()).toInt()
            //if (newN >= x) return null

            if (sqrNewN == 0) return arrayOf(x)
            if (sqrNewN < 0 || newN >= x) return null
            val array = decompose(sqrNewN, newN) ?: continue
            //if (array[array.size - 1] == x) return null
            return arrayOf(*array, x)
        }
        return null
    }
}
