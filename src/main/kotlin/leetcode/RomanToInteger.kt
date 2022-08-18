package leetcode

fun main() {

    val s = RomanToInteger().romanToInt("III")
    println("number is $s")

}

class RomanToInteger {
    fun romanToInt(s: String): Int {


        for (i in s.indices) {
            //XXIV

            if (s.length >= i + 2) {
                if (numberAr.size < 2 && subtractionApplies(s[i], s[i + 1])) {
                    numberAr.add(s[i].toString())
                    numberAr.add(s[i + 1].toString())
                }
            }else{
                numberAr.add(s[i].toString())

            }

            if (numberAr.size == 2) {
                println("numberAr is ${numberAr[0] + numberAr[1]}")

                getSingleNumber(numberAr[0] + numberAr[1])
            }
            if (numberAr.size == 1) {
                println("numberAr is ${numberAr[0]}")

                getSingleNumber(numberAr[0] )
            }


            /*  if ((i + 1) <= s.length) {

                  println("index is ${s[i]} ${s.last()} ")

                  if (subtractionApplies(s[i], s.last())) {
                      println("substraction")
                      getSingleNumber(s[i].toString() + s.last())
                  } else {
  //                    getSingleNumber(s[i].toString())
                  }
              } else {
  //                getSingleNumber(s[i].toString())
              }

  */
        }

        return sum
    }

    private fun getSingleNumberSubtraction(char: Char, char2: Char) {
        if (char2 == 'V') {
            sum = 4
        } else if (char2 == 'X') {
            sum = 9
        }
    }

    private fun subtractionApplies(char: Char, char2: Char): Boolean {
        return char == 'I' && (char2 == 'V' || char2 == 'X')
    }

    var sum = 0
    var numberAr = arrayListOf<String>()

    private fun getSingleNumber(number: String) {

        when (number) {
            "IV" -> {
                sum += 4
                numberAr.clear()
            }
            "IX" -> {
                sum += 9
                numberAr.clear()
            }
            "XL" -> {
                sum += 40
                numberAr.clear()
            }
            "XC" -> {
                sum += 90
                numberAr.clear()
            }
            "CD" -> {
                sum += 400
                numberAr.clear()
            }
            "CM" -> {
                sum += 900
                numberAr.clear()
            }

            "I" -> sum += 1
            "V" -> sum += 5
            "X" -> sum += 10
            "L" -> sum += 50
            "C" -> sum += 100
            "D" -> sum += 500
            "M" -> sum += 1000
            else -> {
                getSingleNumber(numberAr[0])
                getSingleNumber(numberAr[1])
                numberAr.clear()

            }
        }
    }

}