package algoexpert

class TwoNumberSum {

    fun findTwoNumbers(numberArray: Array<Int>, targetNumber: Int): Pair<Int, Int> {
//        val numberArray = arrayOf(1, 3, 4, 11, -1, 4)
//        val target: Int = 10

//        return twoLoopsSolution(numberArray, targetNumber)
        return sortedArraySolution(numberArray, targetNumber)
//        return hashSetSolution(numberArray, targetNumber)
    }

    // O(n^2) time | O(1) space
    private fun twoLoopsSolution(numberArray: Array<Int>, targetNumber: Int): Pair<Int, Int> {
        for (i in numberArray.indices) {
            val firstNumber = numberArray[i]
            for (j in i + 1 until numberArray.size) {
                val secondNumber = numberArray[j]
                if (numberArray[i] + numberArray[j] == targetNumber) {
                    return Pair(firstNumber, secondNumber)
                }
            }
        }

        return Pair(0, 0)
    }

    // O(n) time | O(n) space
    private fun hashSetSolution(numberArray: Array<Int>, targetNumber: Int): Pair<Int, Int> {
        val numHashSet = hashSetOf<Int>()
        numberArray.forEach { number ->
            val potentialMatch = targetNumber - number
            if (numHashSet.contains(potentialMatch)) {
                return Pair(potentialMatch, number)
            } else {
                numHashSet.add(number)
            }
        }

        return Pair(0, 0)
    }

    // O(nLog(n)) time | O(1) space
    private fun sortedArraySolution(numberArray: Array<Int>, targetNumber: Int): Pair<Int, Int> {
        numberArray.sort()
        var left = 0
        var right = numberArray.lastIndex
        while (left < right) {
            var currentSum = numberArray[left] + numberArray[right]
            when {
                currentSum == targetNumber -> {
                    return Pair(numberArray[left], numberArray[right])
                }
                currentSum < targetNumber -> {
                    left += 1
                }
                currentSum > targetNumber -> {
                    right -= 1
                }
            }
        }
        return Pair(0, 0)
    }
}