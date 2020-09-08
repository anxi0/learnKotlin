open class Animal(var name:String, var age:Int, var type:String){
    fun introduce(){
        println("I'm ${type} ${name}, ${age} y/o")
    }
}
class Dog(name:String, age:Int) : Animal(name,age,"Dog"){
    fun bark(){
        println("wof wof")
    }
}

fun main(){ //inherit also can merge two instances
//super class can be with open keyword
//1. sub class can't be the same name w/ superclass
//2. sub class should call super's constructor
    var a = Animal("a",5,"dog")
    var b = Dog("b",5)
}