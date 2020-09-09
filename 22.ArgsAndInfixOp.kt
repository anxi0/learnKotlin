//overloading
/*
    For same name of function, 
    if numbers of parameters and type is different,
    can define many times.
 */
 fun main(){
    read("1")
    deliveryItem("soup")
    deliveryItem("book",3)
    deliveryItem("laptop",0,"school")
    deliveryItem("gift",destination="friend")
     
    sum("JW",1,2,3)
    
    println(6 multiply 4)
    println(6.multiply(4))
 }

 fun read(x: Int){
     print("It's num $x")
 }
  fun read(x: String){
     print("It's char $x")
 }

//default args
fun deliveryItem(name:String, count: Int =1, destination :String = "Home"){
    println("we delivered $count $name to $destination")
}

//variable arguments must be the last parameter
fun sum(name :String,vararg nubmers:Int){
    var sum =0
    for(n in nubmers){
        sum+=n
    }
    println("$name! amazing $sum came out!")
}

//infix ops
infix fun Int.multiply(x:Int):Int = this*x
