/*true = год невисокосный
*false = год високосный*/

fun main (args:Array<String>){
    if(!division(2020)) println("Год високосный") else println("Год невисокосный");
}

fun division(num:Int):Boolean{
    if(num%4!=0) return true
    if(num%100!=0) return false
    if(num%400!=0) return true
    return false
}