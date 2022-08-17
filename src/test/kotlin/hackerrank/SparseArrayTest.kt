package hackerrank

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class SparseArrayTest {

    @Test
    fun givenQueriesAndString_thenReturnNumberOfOccurences() {
        val strings = arrayOf("ab", "abc", "ab")
        val queries = arrayOf("ab", "abc", "bc")

        val resultArray = matchingStrings(strings, queries)

        Assert.assertArrayEquals(arrayOf(2, 1, 0), resultArray)
    }
    @Test
    fun givenQueriesAndString_thenReturnNumberOfOccurences2() {
        val strings = arrayOf("ab", "abc", "ab")
        val queries = arrayOf("ab", "abw", "bc")

        val resultArray = matchingStrings(strings, queries)

        Assert.assertArrayEquals(arrayOf(2, 0, 0), resultArray)
    }
}