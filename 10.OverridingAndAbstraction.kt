open class Animal1{
    open fun eat(){
        println("eat food")
    }
}
class Tiger : Animal1(){ //overriding
    override fun eat(){
        println("Consume meat")
    }
}
abstract class Animal2{
    abstract fun eat()
    fun sniff(){
        println("snip snip")
    }
}
class Rabbit : Animal2(){
    override fun eat(){
        println("Consume carrot")
    }
}
interface Runner{
    fun run(){
        println("run")
    }
}
interface Eater{
    fun eat(){
        println("eat")
    }
}
class Human: Runner,Eater{
    override fun run(){
        println("run out")
    }
    override fun eat(){
        println("eat out")
    }
}

fun main(){
    var r = Rabbit()

    r.eat()
    r.sniff()

    var h = Human()
    h.run()
    h.eat()
}
//override : cover up
//abstraction : naming , structure
//interface : structure for merging