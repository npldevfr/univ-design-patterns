package tp1.dates

import java.util.Date

class DateFormatter(var formatter: IFormatter) {

    fun display(date: Date): String {
        return formatter(date)
    }
}