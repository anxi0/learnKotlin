fun main(){
    //CONST
    var a = FoodCourt() 
    //using two types
    a.searchPrice("creampasta")
    a.searchPrice(FoodCourt.FOOD_STEAK)

    //LATEINIT
    /*
        Before define, you can't use that variable
    */
    val b = LateInitSample()

    println(b.getLateInitText())
    b.text = "New sentence"
    println(b.getLateInitText())

    //LAZY
    //initialize when It used
    val c: Int by lazy{
        println("Initializing")
        7 //initialize at here
    }
}

//CONST
class FoodCourt{
    fun searchPrice(foodName: String){
        val price = when(foodName){
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("${foodName} price : ${price}")
    }

    companion object{
        const val FOOD_CREAM_PASTA="creampasta"
        const val FOOD_STEAK="steak"
        const val FOOD_PIZZA="pizza"
    }
}
//LATEINIT

class LateInitSample{
    lateinit var text: String

    fun getLateInitText() : String{
        if(::text.isInitialized){
            return text
        } else{
            return "default"
        }
    }
}