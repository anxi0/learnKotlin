fun main(){
    val string = "Kotlin.is.fun!"

    println(string.length)

    println(string.toLowerCase())
    println(string.toUpperCase())

    val string2 = string.split(".")
    println(string2)
    
    println(string2.joinToString())
    println(string2.joinToString(" "))
    println(string.substring(5..10))

    //blank check
    val nullString : String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    println(nullString.isNullOrEmpty()) //really none
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())
    println()
    println(nullString.isNullOrBlank()) //blank, tab, etc....
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    //startsWith() endsWith() contains()
}