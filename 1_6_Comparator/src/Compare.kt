fun main(args:Array<String>){
    print("Введите 1-е число: ")
    var first:String? = readLine()
    print("Введите 2-е число: ")
    var second:String? = readLine()
    var firstNum = first!!.toDouble()
    var secondNum = second!!.toDouble()
    var boolVar = firstNum>secondNum
    println(boolVar)
}