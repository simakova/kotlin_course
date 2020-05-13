fun main(){
    var info: ArrayList<HashMap<String, String>> = arrayListOf()

    setInfo(info, arrayOf<String>("Ivanov I.I","director"))
    setInfo(info, arrayOf<String>("Smirnov S.S.", "artist", "22"))
    setInfo(info, arrayOf<String>("Petrov P.P.", "outstaff", "30", "free"))
    println("Введите ФИО сотрудника, должность, возраст(опциоально), статус(опционально) через запятую. Для вызода введите exit")

    while(true) {
       var text = readLine()
        if(text.equals("exit")){
            break
        }
        else {
            var points:Array<String> = text!!.split(",").toTypedArray()
            setInfo(info, points)
        }
    }

for(person in info) {
    getInfo(person.getValue("fio"), person.getValue("position"), person.getValue("age"), person.getValue("status"))
}
}
fun getInfo(fio:String, position:String){
    println("fio = $fio, position = $position")

}

fun getInfo(fio:String, position:String, age: String){
    if (age.isEmpty()) getInfo(fio, position)
    else
        println("fio = $fio, position = $position, age = $age")
}

fun getInfo(fio:String, position:String, age:String, status:String){
    if (status.isEmpty()) getInfo(fio, position, age)
    else
        println("fio = $fio, position = $position, age = $age, status = $status")
}

fun setInfo (info:ArrayList<HashMap<String, String>>, points:Array<String>){
    var fio = points.getOrNull(0)
    var position = points.getOrNull(1)
    var age = points.getOrNull(2)
    var status = points.getOrNull(3)
    info.add(hashMapOf("fio" to fio.orEmpty(), "position" to position.orEmpty(), "age" to age.orEmpty(), "status" to status.orEmpty()))
}
