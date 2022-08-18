package leetcode

import org.junit.Test
import kotlin.test.assertEquals


internal class RomanToIntegerTest {


    val sut = RomanToInteger()

    @Test
    fun givenIII_Returns3() {
        assertEquals( 3, sut.romanToInt("III"))
    }

    @Test
    fun givenV_Returns5() {
        assertEquals(sut.romanToInt("V"), 5)
    }

    @Test
    fun givenX_Returns10() {
        assertEquals(sut.romanToInt("V"), 5)
    }

    @Test
    fun givenL_Returns50() {
        assertEquals(sut.romanToInt("L"), 50)
    }

    @Test
    fun givenC_Returns100() {
        assertEquals(sut.romanToInt("C"), 100)
    }

    @Test
    fun givenD_Returns500() {
        assertEquals(sut.romanToInt("D"), 500)
    }

    @Test
    fun givenM_Returns1000() {
        assertEquals(sut.romanToInt("M"), 1000)
    }

    @Test
    fun givenVII_Returns7() {
        assertEquals(sut.romanToInt("VII"), 7)
    }

    @Test
    fun givenIV_Returns4() {
        assertEquals( 4, sut.romanToInt("IV"))
    }
}