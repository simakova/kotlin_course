class Boing(id: Int, maxRange:Double, capacity:Double, val passengers:Int):Aircraft(id, maxRange, capacity),Passenger {
    override val passenger: Int = passengers

    override fun display(){
        println("Identification: $id, max range: $maxRange, capacity: $capacity, gasoline Mileage per 100: $gasMileage100, passengers capacity: $passengers")
    }
}
