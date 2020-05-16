class Aircraft(id: Int, maxRange:Double, capacity:Double) {
    var gasMileage100: Double = ((capacity.div(maxRange))*100)
    val fullInfo = "id = $id, max range = $maxRange, capacity = $capacity, gasoline consumptions per 100 km = $gasMileage100 L/100km"
}
