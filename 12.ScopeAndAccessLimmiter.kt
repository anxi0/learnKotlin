//pairs member variables
//could be inside of package, class, function
//see what happens
val a = "package scope"

class B{
    val a = "class scope" // can cover up, no collision
    fun print(){
        println(a)
    }
}
fun main(){
    val a = "function scope" // can cover up, no collision
    println(a)
    B().print()
}
//accesslimmiter
//public internal private protected
//act for all member variables

/*
pakcage scope
public is default
internal can access for same module
private can access for same file
 */

/*
class scope
public is default
private can access inside class
protected can access for oneself and inherited
 */