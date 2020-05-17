class CargoCraft(name:String, id: Int, maxRange:Double, capacity:Double, private val _weight:Int):Aircraft(name, id, maxRange, capacity),Cargo{
    override val weight: Int
        get() = this._weight

    override fun info(): String {
        return super.info() + " carrying capacity(in kg): $weight"
    }
}