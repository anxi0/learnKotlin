fun main(){
    b(::a)
    
    //lambda itself it's highorderfunction so don't use ::
    val c: (String)->Unit = { str -> println("$str lambda function") }
    // Also can written like this
    //val c = {str :String -> println("$str lambdafunction")}
    b(c)
}
fun a (str:String){
    println("$str function a")
}
fun b (function : (String)->Unit){
    function("B have called")
}
//lambda with many lines
//lambda with many lines return by last line
val c :(String)-> Int = { str,a,b ->
    println("$str lambda")
    println("many")
    println("lines")
    a+b //return this
}
// lambda without parameter
val a : ()->Unit = {println("no parmas")}
//one parameter
val b : (String) ->Unit={ println("$it lambda function")}