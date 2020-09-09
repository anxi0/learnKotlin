fun main(){
    
    //a.add(4) got an error
    
    b.add(4)
    println(b[3])
    
    b.add(2,8)
    println(b[2])

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}

//list
var a = listOf(1,2,3)
//mutable list
var b = mutableListOf(1,2,3)


