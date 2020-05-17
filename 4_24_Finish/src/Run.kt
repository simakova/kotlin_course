fun main(){
    val boing1 = PassengerCraft("Boing-747",1, 14815.0, 242470.0, 500)
    val airobus1 = PassengerCraft("Airobus-A320",2, 6100.0, 27200.0, 180)
    val an1 = CargoCraft("An-124", 3, 4800.0, 212350.0, 120000)
    val airobus2 = PassengerCraft("Airobus-A320",2, 6100.0, 27200.0, 180)
    var aircompany:Set<Aircraft> = hashSetOf(boing1, airobus1, airobus2, an1)

    while(true) {
        println("Введите 1 - для получения информации об имеющихся самолетах в авиакомпании\n" +
                "2 - для получения инфрмации о количестве самолетов в авиакомпании\n" +
                "3 - для получения информации о грузо и пассажировмемтимости всех авиа судов в компании\n" +
                "4 - для выхода")
        var input = readLine()
        when (input.toString()) {
            "1" -> aircompany.forEach { aircraft -> println(aircraft.info()) }
            "2" -> println("Количество самолетов:" + aircompany.size)
            "3" -> {var countPas = 0
                var countWeight = 0
                for (aircraft in aircompany) {
                    when (aircraft){
                        is CargoCraft -> countWeight+=aircraft.weight
                        is PassengerCraft -> {countPas+=aircraft.passenger}
                    }
                }
                println("Комапния может перевозить $countPas человек и $countWeight кг груза")
            }
            "4" -> return
            else -> println("Введена неверная команда ")
        }
    }
}
