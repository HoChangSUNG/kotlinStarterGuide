package section3

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class KotlinFilePrinter {
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader  = BufferedReader(FileReader(file));
        println(reader.readLine())
        reader.close()
    }

    // try with resources 구문이 없음
    fun readFile(path:String){
        BufferedReader(FileReader(path)).use {reader ->
            println(reader.readLine())
        }
    }
}