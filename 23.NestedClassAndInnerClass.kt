//Nested Class
/*
    Just binding, different class
*/
//Inner Class
/*
    Can't make without Outer ones
*/
fun main(){
    Outer.Nested().introduce() //Nested can access like this

    val outer = Outer()
    val inner = outer.Inner() //Inner Class

    inner.introduceInner()
    inner.intorduceOuter()

    outer.text = "Changed Outer Class"
    inner.intorduceOuter()
}
class Outer{
    var text = "Outer Class"
    class Nested{
        fun introduce(){
            println("Nested Class")
        }
    }
    inner class Inner{
        var text = "Inner Class"
        fun introduceInner(){
            println(text)
        } 
        fun intorduceOuter(){
            println(this@Outer.text)
        }
    }
}