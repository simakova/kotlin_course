class Boing(val id: Int, val maxRange:Double, val capacity:Double, val passengers:Int):Aircraft() {
    var gasMileage100: Double = ((capacity.div(maxRange))*100)

    override fun display(){
        println("Identification: $id, max range: $maxRange, capacity: $capacity, gasoline Mileage per 100: $gasMileage100, passengers capacity: $passengers")
    }
}
