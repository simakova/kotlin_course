class Aircraft(id: Int, maxRange:Double, capacity:Double) {
    val fullName = "id = $id, max range = $maxRange, capacity = $capacity"
    var gasMileage100: Double = ((capacity.div(maxRange))*100)
}
