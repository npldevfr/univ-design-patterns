package tp1.dates

import java.text.SimpleDateFormat
import java.util.*


class ISODateFormatter: IFormatter {

    override fun invoke(date: Date): String {
        return SimpleDateFormat("yyyy-MM-dd").format(date)
    }
}