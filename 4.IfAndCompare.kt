//if
// < <= > >= == !is is
//when
fun main(){
    println(doWhen(0x1111))
}
fun doWhen(a:Any):String{
    var result = when(a){
        1 ->"number"
        "JW"->"hi Admin"
        true->"that's true"
        is String -> "string!"
        !is Long -> "not long"
        else->"none"
    }
    return result
}