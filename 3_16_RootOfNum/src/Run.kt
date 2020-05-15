import kotlin.math.sqrt

fun main(){
    println("Введите число:")
    //dynamic data
    val input:Double = readLine()!!.toDouble()
    printRoot(input, fun(input:Double): Double { return input.getRoot() })
    //for example: static data
    printRoot(81.0, fun(input:Double): Double { return input.getRoot() })
    printRoot(225.0, fun(input:Double): Double {return input.getRoot()})
}
//extension fun
fun Double.getRoot():Double {
    return sqrt(this)
}

//anonymous fun
fun printRoot(num: Double, op: (Double) -> Double){
    val result = op(num)
    println("Корень из числа $num = $result")
}
