package hackerrank

class SinglyLinkedListNode(
    var data: Int? = null,
    var next: SinglyLinkedListNode? = null
)

fun insertNodeAtHead(llist: SinglyLinkedListNode?, data: Int): SinglyLinkedListNode {
//    llist.next = llist
//    llist.data = data
//    return insertNodeAtHead(llist.next, data)

    var newList : SinglyLinkedListNode? = null
    val x = SinglyLinkedListNode(data)
    if (llist == null) {
        newList = x
    } else {
        val new_node = x
        new_node.next = llist
        newList = new_node
    }
    return newList
}

fun main() {

}