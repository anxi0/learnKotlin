class Person(var name:String, val age:Int){
    init{
        println("${this.age} y/o ${this.name}")
    }
    constructor(name:String) : this(name,1997){//sub constructor
        println("sub created")
    } 
    fun hi(){
        println("hi I'm ${this.age} ${this.name}")
    }
}

fun main(){
    var a = Person("JJ")
    var b = Person("JW",2002)
    a.hi()
    b.hi()
}
