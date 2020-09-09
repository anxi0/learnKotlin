fun main(){
    val string : String? = null
    //?. nullsafe op
    println(string?.toUpperCase()) // don't execute just print null

    //?: elvis op
    println(string?:"hi".toUpperCase()) //changes to hi
    
    //!!. non-null assertion op
    //println(string!!.toUpperCase()) //compiler ignores this null
    //then abnormal exit

    var a= Product("coke",1000)
    var b= Product("coke",1000)
    var c= a
    var d= Product("cider",1000)

    println(a==b) //index equality
    println(a===b) //object equality

    println(a==c)
    println(a===c)

    println(a==d)
    println(a===d)
}

class Product(val name:String, val price: Int){
    override fun equals(other: Any?):Boolean{
        if(other is Product){
            return other.name == name && other.price == price
        } else{
            return false
        }
    }
}