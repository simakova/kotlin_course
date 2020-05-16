class Boing747(id: Int, maxRange: Double, capacity: Double, pass: Int) : Aircraft(id, maxRange, capacity) {
    var passengers: Int = pass

    override fun display() {
        super.display()
        println("Passengers capacity: $passengers")
    }
}