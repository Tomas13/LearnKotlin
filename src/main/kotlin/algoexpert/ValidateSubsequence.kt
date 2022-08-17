package algoexpert

class ValidateSubsequence {
    fun validateSubsequence(array: Array<Int>, sequence: Array<Int>): Boolean {
        var arrayPointer = 0
        var sequencePointer = 0

        while (sequencePointer < sequence.size - 1) {
            if (array[arrayPointer] == sequence[sequencePointer]) {
                if (sequencePointer == sequence.size - 1) {
                    return true
                }
                sequencePointer += 1
            } else {
                arrayPointer += 1
                if (arrayPointer == array.size - 1) {
                    return false
                }

            }

        }
        return true
    }


    //O(n) time | O(1) space
    fun validateSubsequenceExpert(array: Array<Int>, sequence: Array<Int>): Boolean {
        var arrayPointer = 0
        var sequencePointer = 0

        while (arrayPointer < array.size && sequencePointer < sequence.size) {
            if (array[arrayPointer] == sequence[sequencePointer]) {
                sequencePointer += 1
            }
            arrayPointer += 1
        }
        return sequencePointer == sequence.size
    }

    //O(n) time | O(1) space
    fun validateSubsequenceForLoopExpert(array: Array<Int>, sequence: Array<Int>): Boolean {
        var sequencePointer = 0

        array.forEach {
            if (sequencePointer == sequence.size) {
                return@forEach
            }
            if (it == sequence[sequencePointer]) {
                sequencePointer += 1
            }
        }
        return sequencePointer == sequence.size
    }

}