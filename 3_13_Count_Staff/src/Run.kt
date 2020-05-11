fun main(args:Array<String>){
    println("Введите имена сотрудников через запятую:")
    var input = readLine()
    println("Количество сотрудников: " + count(*input!!.split(",").toTypedArray()))
}

fun count(vararg names:String):Int{
    var count=0;
    for (name in names)
        if(name.isNotEmpty())
            count++;
    return count
}