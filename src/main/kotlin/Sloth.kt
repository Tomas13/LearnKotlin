import kotlin.random.Random
import kotlin.reflect.KFunction1

sealed class Mammal(val name: String) {
    fun eat() {}
    fun sleep() {}
    fun swim() {
        println("${name.toUpperCase()} CAN SWIM")
    }

    open fun relief() {}
}

data class Sloth(
    val slothName: String,
    val isTwoFingered: Boolean,
    val slothWeight: Int
) : Mammal(slothName) {
    override fun relief() {
        val oldWeight = slothWeight
        val weightShed = Random.nextInt(0, slothWeight / 3)
        val newWeight = slothWeight - weightShed
        println("${slothName.toUpperCase()} FINALLY WENT THIS WEEK")
        println("\tOld weight: $oldWeight \t|\t New weight: $newWeight")
    }
}

fun slothActivity(sloth: Sloth, action: Unit) {
    sloth.run { action }
}

data class Panda(val pandaName: String) : Mammal(pandaName)

data class Manatee(val manateeName: String) : Mammal(manateeName)

fun Mammal.vertebraeCount(): Int {
    return when (this) {
        is Manatee -> 6
        is Sloth -> 10
        else -> 7
    }
}

fun Mammal.knownSpeciesCount(): Int {
    return when (this) {
        is Sloth -> 6
        is Panda -> 2
        is Manatee -> 3
    }
}

fun Mammal.isMammalEndangered(): Boolean {
    return when (this) {
        is Sloth -> true
        is Panda -> true
        is Manatee -> false
    }
}

fun mammalFactCheck(mammal: Mammal, factCheck: KFunction1<Mammal, Int>): Int {
    return factCheck(mammal)
}


fun feedCrew(crew: List<Mammal>) {
    crew.forEach {
        it.eat()
        println(it.name + " ate some rad leaves!")
    }
}

fun feedCrewPandas(crew: List<Panda>) {
    crew.forEach {
        it.eat()
        println(it.name + " ate some rad leaves!")
    }
}

fun main() {
    val slothCrew = listOf(
        Sloth("Jerry", false, 15),
        Sloth("Bae", true, 12),
        Sloth("Alex", false, 15)
    )

/*
    slothCrew.forEach {
        slothActivity(it, it.swim())
        slothActivity(it, it.relief())
    }
*/

//    feedCrew(slothCrew)

    val pandaCrew = listOf(
        Panda("Tegan"),
        Panda("Peggy")
    )

//    feedCrew(pandaCrew)

    val squad = listOf(
        Sloth("Jerry", false, 15),
        Sloth("Bae", true, 12),
        Sloth("Alex", false, 15),
        Panda("Tegan"),
        Panda("Peggy")
    )

    val crewCrewCrew = listOf(
        Sloth("Jerry", false, 15),
        Panda("Tegan"),
        Manatee("Manny")
    )

//    printAnimalResultFiltered(Sloth::class.java, crewCrewCrew, Mammal::knownSpeciesCount)
    printAnimalResultFiltered<Sloth>(crewCrewCrew, Mammal::knownSpeciesCount)

/*
    crewCrewCrew
        .filterIsInstance<Sloth>()
        .forEach {
            println(
                "${it.javaClass.name} - " +
                        "${mammalFactCheck(it, Mammal::knownSpeciesCount)}"
            )

//        mammalFactCheck(it, Mammal::isMammalEndangered)
        }
*/

//    val compareByNames = Comparator { a: Mammal, b: Mammal ->
//        a.name.first().toInt() - b.name.first().toInt()
//    }
//
//    squad.sortedWith(compareByNames).forEach(::println)

    val slothList: List<Sloth> = listOf()
    val slothList2 = listOf<Sloth>()
}

fun <T : Mammal> printAnimalResultFiltered(
    clazz: Class<T>,
    list: List<Mammal>,
    factCheck: Mammal.() -> Int
): List<Mammal> {
    if (list.isNotEmpty()) {
        list.forEach {
            if (clazz.isInstance(it)) {
                println(
                    "${it.javaClass.name} - " +
                            "${mammalFactCheck(it, Mammal::knownSpeciesCount)}"
                )
            }
//            list.filterIsInstance<clazz>()
        }
    }
    return list
}

inline fun <reified T : Mammal>  printAnimalResultFiltered(
    list: List<Mammal>,
    factCheck: Mammal.() -> Int
): List<Mammal> {
    if (list.isNotEmpty()) {
        list
            .filterIsInstance<T>()
            .forEach {
                println(
                    "${it.javaClass.name} - " +
                            "${mammalFactCheck(it, Mammal::knownSpeciesCount)}"
                )
            }
    }
    return list
}
