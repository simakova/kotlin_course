fun main(){
    var workspace: Map<Int, String> = mapOf(1 to "Ivanov I.I.", 2 to "Petrov P.P.", 3 to "Sidorov S.S.", 4 to "Karavaev K.K.")
    while(true) {
        println("Введите номер рабочего места(от 1 до 4)")
        var text = readLine()
        println("Это место принадлежит " + workspace[text!!.toInt()])
    }
}