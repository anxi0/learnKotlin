//singleton pattern (with single instance)
fun main(){
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)    

    Counter.clear()

    println(Counter.count)

    var a = FoodPoll("a")
    var b = FoodPoll("b")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("total : ${FoodPoll.total}")
}

object Counter{
    var count = 0

    fun countUp(){
        count++
    }
    fun clear(){
        count =0
    }
}
class FoodPoll (val name : String){//similar with static
    companion object{
        var total =0
    }
    var count = 0
    fun vote(){
        total++
        count++
    }
}