class PassengerCraft(name: String, id: Int, maxRange:Double, capacity:Double, pass:Int):Aircraft(name, id, maxRange, capacity),Passenger {
    override val passenger: Int = pass

    override fun info(): String {
        return super.info() + " passengers capacity: $passenger"
    }
}



