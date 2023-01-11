package tp1.dates

import java.text.SimpleDateFormat
import java.util.*

class UKDateFormatter: IFormatter {

    override fun invoke(date: Date): String {
        return SimpleDateFormat("dd/MM/yyyy").format(date)
    }
}