class Person(var name: String, var age:Int){
    fun greetings(){
        println("hi I'm ${this.name} and born in ${this.age} y/o")
    }
}
fun main(){
    var a = Person("장준원",2002)
    a.greetings()
}