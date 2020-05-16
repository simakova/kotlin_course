open class Aircraft (val id: Int, val maxRange:Double, val capacity:Double) {

    var gasMileage100: Double = ((capacity.div(maxRange))*100)

    open fun display(){
        println("Identification: $id, max range: $maxRange, capacity: $capacity, gasoline Mileage per 100: $gasMileage100")
    }
}