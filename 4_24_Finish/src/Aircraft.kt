abstract class Aircraft(val name: String, val id: Int, val maxRange:Double, val capacity:Double) {
    protected var gasMileage100: Double = ((capacity.div(maxRange))*100)
    var baseData: Aircraft? = null

    open fun info():String{
        return "$name:$id, max range: $maxRange, capacity: $capacity, gasoline Mileage per 100: $gasMileage100"
    }
}