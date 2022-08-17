package algoexpert

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class TwoNumberSumTest {

    @Test
    fun `given array of numbers, find two numbers sum should equal target number`() {
        val target: Int = 97
        val numberArray = arrayOf(
            1, 3, 27, 28,
            29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49
        )
        val resultNumbers: Pair<Int, Int> = TwoNumberSum().findTwoNumbers(numberArray, target)

        assertThat(resultNumbers.first + resultNumbers.second).isEqualTo(target)
    }

    @Test
    fun `given array of numbers, find two numbers sum should equal target number2`() {
        val target: Int = 9
        val numberArray = arrayOf(1, 5, 4, 6, -1, 4)
        val resultNumbers: Pair<Int, Int> = TwoNumberSum().findTwoNumbers(numberArray, target)

        assertThat(resultNumbers.first + resultNumbers.second).isEqualTo(target)
    }

    @Test
    fun `given array of numbers that contains no target sum, find two numbers sum should equal pair of zeros`() {
        val target: Int = 20
        val numberArray = arrayOf(1, 5, 4, 6, -1, 4)
        val resultNumbers: Pair<Int, Int> = TwoNumberSum().findTwoNumbers(numberArray, target)

        assertThat(resultNumbers).isEqualTo(Pair(0, 0))
    }
}