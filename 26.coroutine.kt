//GlobalScope and CorountineScope
//dispatchers
/*
	Dispatchers.Default -> normal backgrounds
    Dispatchers.IO -> input output
    Dispatchers.Main -> work with UI thread
*/
/*
 * launch is Job object without return
 * async is Deffered object with return -> last line return
 */
 
import kotlinx.coroutines.*
fun main() {
	val scope = GlobalScope
    scope.launch{
        for (i in 1..5){
            println(i)
        }
    }
}
