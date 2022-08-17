fun main() {

    fun getArrayFromNumber(number: Int): IntArray {
        val temp = number.toString()
        val array = IntArray(temp.length)
        for (i in temp.indices) {
            array[i] = temp[i] - '0'
        }
        return array
    }

    fun solution(N: Int) {
        //15958 => 1958

        val array = getArrayFromNumber(N)
//        val arrayList = arrayListOf(array.toTypedArray())
//        val arrayList = array.toCollection(ArrayList())
        val list = array.toList()
        var isRemoved = false
        var finalArrayList = arrayListOf<Int>()
        finalArrayList.addAll(list)

        list.forEachIndexed { index, i ->

            if (i == 5 && !isRemoved) {
                finalArrayList.removeAt(index)
                isRemoved = true
            }
        }

        println(finalArrayList)
    }

    solution(-5859) // => -589
    solution(15958)

}

