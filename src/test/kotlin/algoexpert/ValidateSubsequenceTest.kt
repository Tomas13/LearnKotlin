package algoexpert

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidateSubsequenceTest {

    private val subjectUnderTest = ValidateSubsequence()

    @Test
    fun givenSequenceAndCorrectSubsequence_ThenReturnTrue() {
        val sequence = arrayOf(5, 1, 22, 25, 6, -1, 8, 10)
        val subSequence = arrayOf(1, 44, -1, 10)

        val result = subjectUnderTest.validateSubsequenceForLoopExpert(sequence, subSequence)

        Assert.assertFalse(result)
    }

    @Test
    fun givenSequenceAndIncorrectSubsequence_ThenReturnFalse() {
        val sequence = arrayOf(5, 1, 22, 25, 6, -1, 8, 10)
        val subSequence = arrayOf(6, 22, -1, 10)

        val result = subjectUnderTest.validateSubsequenceForLoopExpert(sequence, subSequence)

        Assert.assertFalse(result)
    }
    @Test
    fun givenEmptySequenceAndSomeSubsequence_ThenReturnFalse() {
        val sequence = Array<Int>(0) { it }
        val subSequence = arrayOf(6, 22, -1, 10)

        val result = subjectUnderTest.validateSubsequenceForLoopExpert(sequence, subSequence)

        Assert.assertFalse(result)
    }


}