package hn.util

import java.io.FileWriter
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.*

private const val LOGS_FILENAME = "logs.txt"
private const val DATE_FORMAT = "dd/MM/yyyy - hh:mm a"
private const val DIVIDER = "-"

class LogsStorage {
    private val printWriter = PrintWriter(FileWriter(LOGS_FILENAME, true), true)

    fun appendDate() {
        val simpleDateFormat = SimpleDateFormat(DATE_FORMAT)
        val date = simpleDateFormat.format(Date())
        printWriter.println(date)
        printWriter.println(DIVIDER.repeat(date.length))
    }

    fun saveString(text: String) {
        printWriter.println(text)
    }

    fun close() {
        printWriter.println()
        printWriter.close()
    }
}