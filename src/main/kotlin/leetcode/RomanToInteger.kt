package leetcode

fun main() {

    val s = RomanToInteger().romanToInt("III")
    println("number is $s")

}

class RomanToInteger {
    fun romanToInt(s: String): Int {
        s.forEach {
            getSingleNumber(it)
        }

        return sum
    }

    var sum = 0

    private fun getSingleNumber(number: Char) {
        when (number) {
            'I' -> sum += 1
            'V' -> sum += 5
            'X' -> sum += 10
            'L' -> sum += 50
            'C' -> sum += 100
            'D' -> sum += 500
            'M' -> sum += 1000
            else -> {}
        }
    }

}