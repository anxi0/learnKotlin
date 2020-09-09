import kotlinx.coroutines.*
fun main() {
	runBlocking{
        var result = withTimeoutOrNull(50){
            for(i in 1..4){
                println(i)
                delay(10)
            }
            "Finish" 
        }
        println(result)
    }
}