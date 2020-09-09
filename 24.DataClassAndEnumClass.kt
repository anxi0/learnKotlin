/*
class auto makes these 
equals
hashcode
toString
copy
componentX
*/

fun main(){
    val a = General("JW",212)

    println(a == General("JW",212))
    println(a.hashCode())
    println(a)

    val b = Data("SW",303)

    println(b == Data("SW",303))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("GW"))
    println(b.copy(id=111))

    val list = listOf(Data("JW",123),Data("SW",234),Data("GW",345))
    for ((a, b) in list){
        println("$a , $b")
    }

    var state = State.DAEGU
    println(state)

    state = State.SEOUL
    println(state.isSeoulian())

    state = State.BUSAN
    println(state.introduction)
}

class General(val name:String, val id : Int)

data class Data(val name:String, val id : Int)

enum class State(val introduction:String){
    SEOUL("Many people"),
    DAEGU("BEST"),
    BUSAN("SEASIDE");

    fun isSeoulian() = this == State.SEOUL
}