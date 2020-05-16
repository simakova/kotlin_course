class Boing747:Aircraft{
    var passangeers: Int? = null

    constructor(id: Int, maxRange:Double, capacity:Double, pass:Int) : super(id, maxRange, capacity){

        passangeers = pass

    }
}