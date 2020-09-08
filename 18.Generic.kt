//
fun main(){
    UsingGeneric(A()).doShout()
    UsingGeneric(B()).doShout()
    UsingGeneric(C()).doShout()

    doShouting(B())
}

open class A {
    open fun shout(){
        println("A shouts")
    }
}
class B : A(){
    override fun shout(){
        println("B shouts")
    }
}

class C : A(){
    override fun shout(){
        println("C shouts")
    }
}
class UsingGeneric<T:A> (val t : T){// Using T,U,V can select superclass
    fun doShout(){
        t.shout()
    }
}
fun<T:A> doShouting(t:T){
    t.shout()
}