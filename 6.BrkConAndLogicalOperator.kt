//break(get out one cover loop) continue(jumps one loop at that point)
fun main(){
    point@for (i in 1..9){
        for (j in 1..9){
            if(i==1 && j==2) break@point
            println("$i,$j")
        }
    }
}
// && || !