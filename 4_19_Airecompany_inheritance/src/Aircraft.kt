open class Aircraft (id: Int, maxRange:Double, capacity:Double) {
    var gasMileage100: Double = ((capacity.div(maxRange))*100)
}