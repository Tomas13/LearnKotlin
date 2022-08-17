//package algoexpert
//
//class BST<T>(private val value: T) {
//    var right: BST<T>? = null
//    var left: BST<T>? = null
//    lateinit var currentNode: BST<T>
//
//
//    fun insert(value: T): BST<T> {
//        currentNode = this
//        while (true) {
//            if (value < currentNode.value) {
//                if (currentNode.left == null) {
//                    currentNode.left = BST(value)
//                    break
//                } else {
//                    currentNode = currentNode.left!!
//                }
//            } else {
//                if (currentNode.right == null) {
//                    currentNode.right = BST(value)
//                    break
//                } else {
//                    currentNode = currentNode.right!!
//                }
//
//            }
//        }
//        return this
//    }
//
//    fun contains(value: T): Boolean {
//        return false
//    }
//
//    fun remove(value: T, parentNode: T? = null) {
//
//    }
//
//}