fun main (){
    val printer = {messages: Array<String> -> messages.forEach { i -> println(i)}}
    printer(arrayOf("It", "Is", "Not", "A", "Bug", "It", "Is", "A", "Feature"))

    var messages2: Array<String> = arrayOf("What", "is", "happened", "?")
    val printer2 = messages2.forEach{i -> println(i)}
}