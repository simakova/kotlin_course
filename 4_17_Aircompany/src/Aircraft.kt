class Aircraft (){
    var id: Int = 1
    var maxRange:Double = 500.0
    var capacity:Double = 70.0
    val gasMileage100: Double
        get() = ((capacity.div(maxRange))*100)
}

fun main() {
    val airplane = Aircraft()

    print(airplane.gasMileage100)
}