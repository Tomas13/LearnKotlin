//class Invariant<T>  {
//    fun f(i: Int): T { throw Exception() } // OK
//    fun f(t: T): Int { throw Exception() } // OK
//}
//
//class Contravariant<in T> {
////    fun f(i: Int): T { throw Exception() } // error, T cannot be returned
//    fun f(t: T): Int { throw Exception() } // OK, T is parameter type
//}
//
//class Covariant<out T> {
//    fun f(i: Int): T { throw Exception() } // OK, T is returned
////    fun f(t: T): Int { throw Exception() } // error, T cannnot be parameter type
//}
//
//fun main(){
//    n2.f(Derived())
//    val base = v1.f(2)
//
//
//}
//open class Base
//class Derived: Base()
//
//val i1: Invariant<Base> = Invariant<Derived>() // error
//val i2: Invariant<Derived> = Invariant<Base>() // error
//
//val n1: Contravariant<Base> = Contravariant<Derived>() // error
//val n2: Contravariant<Derived> = Contravariant<Base>() // OK
//
//val v1: Covariant<Base> = Covariant<Derived>() // OK
//val v2: Covariant<Derived> = Covariant<Base>() // error