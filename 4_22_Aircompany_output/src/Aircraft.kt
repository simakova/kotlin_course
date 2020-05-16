abstract class Aircraft(val id: Int, val maxRange:Double, val capacity:Double) {
    protected var gasMileage100: Double = ((capacity.div(maxRange))*100)

    protected open fun display():String{
        return "Identification: $id, max range: $maxRange, capacity: $capacity, gasoline Mileage per 100: $gasMileage100"
    }
}