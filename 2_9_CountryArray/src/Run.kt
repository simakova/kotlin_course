import com.sun.xml.internal.fastinfoset.util.StringArray

fun main() {
    val table: Array<Array<String>> = Array(4, {Array(3, {""}) })
    table[0] = arrayOf("Country", "Capital   ", "Currency")
    table[1] = arrayOf("Russia ", "Moscow    ", "rub")
    table[2] = arrayOf("USA    ", "Vashington", "usd")
    table[3] = arrayOf("Italy  ", "Roma      ", "eur");

    for(row in table){
        for(cell in row){
            print("$cell \t")
        }
        println()
    }
}
