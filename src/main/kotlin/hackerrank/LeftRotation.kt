package hackerrank

import java.util.*


fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    // Write your code here

    val arrayList = arrayListOf<Int>()
    var arr2 = arr.copyOf()
    for (i in 0 until d) {
        arrayList.clear()
        val first = arr2.first()
        arrayList.addAll(arr2.copyOfRange(1, arr.size))
        arrayList.add(first)
        arr2 = arrayList.toTypedArray()
    }


    return arr2
}

fun rotateLeft2(d: Int, arr: Array<Int>): Array<Int> {
    // Write your code here

    val linkedList = LinkedList<Int>()
    linkedList.addAll(arr)
    for (i in 0 until d) {
        val first = linkedList.first
        val last = linkedList.last
        linkedList.add(0, last)
        linkedList.add(linkedList.size - 1, first)
    }

    return linkedList.toTypedArray()
}

