package hackerrank

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/*
* Complete the 'matchingStrings' function below.
*
* The function is expected to return an INTEGER_ARRAY.
* The function accepts following parameters:
*  1. STRING_ARRAY strings
*  2. STRING_ARRAY queries
*/

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    // Write your code here
    val array = Array<Int>(queries.size, { it })

    queries.forEachIndexed { index, query ->
        val count = strings.filter { it == query }.count()
        array[index] = count
    }
    return array
}


