import kotlin.random.Random

fun main(args: Array<String>) {


    val list = (1..10).toList()
    val sum = list.filter { it % 2 == 1 }

    println("The sum is: $sum")

    listOf(Rectangle("sdf")).printAnimalResultFiltered<Rectangle>(
        Shape::name2
    )
}

fun Shape.name2(): Int {
    return 4
}


fun <T : Shape> printAnimalResultFiltered(
    clazz: Class<T>,
    list: List<Shape>,
    factCheck: Shape.() -> Int
): List<Shape> {
    if (list.isNotEmpty()) {
        list.forEach {
            if (clazz.isInstance(it)) println("${it.javaClass.name} - ${it.factCheck()}")
        }
    }
    return list
}

inline fun <reified T : Shape> List<T>.printAnimalResultFiltered(
    factCheck: Shape.() -> Int
): List<Shape> {
    if (this.isNotEmpty()) {
        this.forEach {
            println("${it.javaClass.name} - ${it.factCheck()}")
        }
    }
    return this

}

fun List<Int>.customSum(predicate: (Int) -> Boolean): Int {
    var sum = 0
    this.forEach {
        if (predicate(it)) {
            sum += it
        }
    }

    return sum
}

fun <T> List<T>.customFilter(predicate: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    this.forEach {
        if (predicate(it)) {
            resultList.add(it)
        }
    }

    return resultList
}


abstract class Shape(
    var name: String
) {

    fun changeName(newName: String) {
        name = newName
    }

    abstract fun area(): Int
}

class Rectangle(name: String) : Shape("Rectangle") {
    override fun area(): Int {
        TODO("Not yet implemented")

    }

    constructor(name: String, b: Int) : this(name)


}