//explicit typecatsing : typecast by to~() function
//array 
var intArr = arrayOf(1,2,3,4,5)
var nullArr = arrayOfNulls<Int>(5) //<> is generic

fun main(){
    println(nullArr[3]) //using nullArray available but be care for NPE
}