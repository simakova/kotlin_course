class Boing(id: Int, maxRange:Double, capacity:Double, val pass:Int):Aircraft(id, maxRange, capacity),Passenger {
    override val passenger: Int = pass


    override fun display(): String {
        return "Identification: $id, max range: $maxRange, capacity: $capacity, gasoline Mileage per 100: $gasMileage100, passengers capacity: $passenger"
    }

    internal fun runner(){
        println(display())
    }
}



