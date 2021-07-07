package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        //throw NotImplementedError("Not implemented")
        val classicTelephone = ClassicTelephone(number)
        classicTelephone.findAllNumbersOfNeighbors()
        return classicTelephone.getNumbersOfNeighbours()
    }
}

class ClassicTelephone(private val number: String) {
    private var numbersOfNeighbors = mutableListOf<String>()
    private val mapOfAdjacentKeys = mapOf(
        '1' to arrayOf('2', '4'),
        '2' to arrayOf('1', '3', '5'),
        '3' to arrayOf('2', '6'),
        '4' to arrayOf('1', '5', '7'),
        '5' to arrayOf('2', '4', '6', '8'),
        '6' to arrayOf('3', '5', '9'),
        '7' to arrayOf('4', '8'),
        '8' to arrayOf('5', '7', '9', '0'),
        '9' to arrayOf('6', '8'),
        '0' to arrayOf('8')
    )

    fun getNumbersOfNeighbours(): Array<String>? {
        if (number[0] == '-') return null
        return numbersOfNeighbors.toTypedArray()
    }

    fun findAllNumbersOfNeighbors() {
        if (number[0] == '-') return
        for ((index, numeral) in number.withIndex()) {
            val mutableNumber = StringBuilder(number)
            mapOfAdjacentKeys[numeral]?.forEach {
                mutableNumber[index] = it
                numbersOfNeighbors.add(mutableNumber.toString()) }
        }
    }
}
