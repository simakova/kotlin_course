import kotlin.math.pow

/*TV=P(1+i)^n - сложные проценты*/

fun main(args: Array<String>){
    print("Введите сумму вклада: ");
    var sumText = readLine();
    print("Введите срок размещения(в месяцах): ");
    var durationText = readLine();
    print("Введите процент по вкладу: ");
    var percentText = readLine();

    var sum = sumText!!.toDouble();
    var duration = durationText!!.toInt();
    var percent = percentText!!.toDouble();

    var multiplicator = (1+percent/100).pow(1.0/12);
    println("multi = $multiplicator")
    var totalsum : Double;
    for(n in 1..duration) {
        totalsum = (Math.round(sum*multiplicator.pow(n)*100))/100.toDouble();
        println("$n month: $totalsum")
    }
}