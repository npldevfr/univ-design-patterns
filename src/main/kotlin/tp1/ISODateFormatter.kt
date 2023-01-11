package tp1

import java.text.SimpleDateFormat
import java.util.*


class ISODateFormatter: IFormatter {

    override fun invoke(date: Date): String {
        return SimpleDateFormat("yyyy-MM-dd").format(date)
    }
}