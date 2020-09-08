fun main(){
    //apply run with also let
    var a = Book("Kotlin by anxi0",10000).apply{
        discount()
        name= "[On sale] "+name
    }
    a.run{// can also written like with(a){}
        println("product : ${name}, price: ${price}krw")
    }
    //also and let should use parameter
    /*When you wanna protect other variables' interruption, 
    then use also & let
    */
}
class Book(var name: String, var price: Int){
    fun discount(){
        price -=2000
    }
}