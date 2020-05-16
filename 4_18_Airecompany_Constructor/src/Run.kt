fun main(){
    val aircraft = Aircraft(1254, 14815.0, 242470.0)
    val fullName = aircraft.fullName
    val gasMileAge100 = aircraft.gasMileage100
    println("for aircraft: $fullName gasoline consumptions per 100 km is $gasMileAge100 l/100km")
}