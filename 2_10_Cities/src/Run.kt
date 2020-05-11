fun main(){
    var cities:MutableCollection<String> = mutableListOf();

    while(true) {
        println("\n" + """"Введите действие: 
        add - добавить элемент, 
        print = распечатать список городов, 
        printset = распечатать список уникальных названий городов, 
        exit - выход""".trimMargin());

        val action = readLine();
        when (action!!.toString()) {
            "add" -> {
                println("Введите название города: ")
                val city = readLine();
                println(cities.add(city!!.toString().toLowerCase()));
            }
            "print" -> {
                if (cities.isEmpty()) println("Список пустой, воспользуйтесь командой add")
                else
                    cities.iterator().forEach{ print("$it; ")}
            }
            "printset" -> {
                if (cities.isEmpty()) println("Список пустой, воспользуйтесь командой add")
                else
                    cities.toMutableSet().iterator().forEach{el -> print("$el; ")}
            }
            "exit" -> {
                println("Good Luck!")
                return
            }
            else -> {
                println("Wrong action. Try again")
            }
        }
    }

}