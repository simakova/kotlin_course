data class Car(val model: String, val color:String, val number:String){

    override fun toString(): String {

        return "Model: $model  Color: $color Number: $number"

    }

}