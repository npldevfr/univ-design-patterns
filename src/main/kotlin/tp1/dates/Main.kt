package tp1.dates

import java.util.*

fun main() {

    val date = Date();

    val dateFormatter = DateFormatter(ISODateFormatter())
    println(dateFormatter.display(date))
    dateFormatter.formatter = UKDateFormatter()
    println(dateFormatter.display(date))

}