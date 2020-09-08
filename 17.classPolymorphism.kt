//Down casting by "as" and "is"
//as literally down casts the class
/*"is" checks class type and if it used in 
  "if" sentense it valid for that sentence*/

fun main(){
    var a = Drink()
    a.drink()
    var b: Drink = Cola()
    b.drink()
    //should down cast
    //b.washDishes()
    if(b is Cola){
        b.washDishes()
    }
    var c = b as Cola //Downcasts both of them
    c.washDishes()
    b.washDishes()
}
open class Drink{
    var name = "beverage"
    open fun drink(){
        println("drink ${name}")
    }
}

class Cola: Drink(){
    var type = "Coke"
    override fun drink(){
        println("drink ${type} of ${name}")
    }
    fun washDishes(){
        println("wash dishes by ${type}")
    }
}