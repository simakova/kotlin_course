class Boing747(val id: Int, val maxRange: Double, val capacity: Double, val pass:Int):Passenger {

    override val passenger: Int = pass

    var gasMileage100: Double = ((capacity.div(maxRange)) * 100)

    fun display() {
        println("Identification: $id, max range: $maxRange, capacity: $capacity, " +
                "gasoline Mileage per 100: $gasMileage100, passengers capacity: $passenger")
    }
}