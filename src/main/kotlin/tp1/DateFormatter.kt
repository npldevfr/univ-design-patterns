package tp1

import java.util.Date

class DateFormatter(var formatter: IFormatter) {

    fun display(date: Date): String {
        return formatter(date)
    }
}