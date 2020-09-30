package hn.util

import java.io.FileWriter
import java.io.PrintWriter

private const val JSON_FILENAME = "info.json"

class JsonStorage {
    private val printWriter = PrintWriter(FileWriter(JSON_FILENAME, false))

    fun saveJson(json: String) {
        printWriter.println(json)
    }

    fun close() {
        printWriter.close()
    }
}