package signature

import java.io.File
import java.util.*

enum class StatusLetters(val strings: Array<String>) {
    A(arrayOf("____", "|__|", "|  |")),
    B(arrayOf("___ ", "|__]", "|__]")),
    C(arrayOf("____", "|   ", "|___")),
    D(arrayOf("___ ", "|  \\", "|__/")),
    E(arrayOf("____", "|___", "|___")),
    F(arrayOf("____", "|___", "|   ")),
    G(arrayOf("____", "| __", "|__]")),
    H(arrayOf("_  _", "|__|", "|  |")),
    I(arrayOf("_", "|", "|")),
    J(arrayOf(" _", " |", "_|")),
    K(arrayOf("_  _", "|_/ ", "| \\_")),
    L(arrayOf("_   ", "|   ", "|___")),
    M(arrayOf("_  _", "|\\/|", "|  |")),
    N(arrayOf("_  _", "|\\ |", "| \\|")),
    O(arrayOf("____", "|  |", "|__|")),
    P(arrayOf("___ ", "|__]", "|   ")),
    Q(arrayOf("____", "|  |", "|_\\|")),
    R(arrayOf("____", "|__/", "|  \\")),
    S(arrayOf("____", "[__ ", "___]")),
    T(arrayOf("___", " | ", " | ")),
    U(arrayOf("_  _", "|  |", "|__|")),
    V(arrayOf("_  _", "|  |", " \\/ ")),
    W(arrayOf("_ _ _", "| | |", "|_|_|")),
    X(arrayOf("_  _", " \\/ ", "_/\\_")),
    Y(arrayOf("_   _", " \\_/ ", "  |  ")),
    Z(arrayOf("___ ", "  / ", " /__")),
    SPACE(arrayOf("    ", "    ", "    "));
}

fun main() {
    val input = Scanner(System.`in`)

    println("Enter name and surname:")
    val name = input.nextLine()
    println("Enter person's status:")
    val status = input.nextLine()

    val size = if (nameLength(name) > statusLength(status))
        nameLength(name) + 8
    else
        statusLength(status) + 8

    printBorder(size) // upper border
    printName(name, status)
    printStatus(name, status)
    printBorder(size) // lower border

    }


fun nameLength(name : String) :Int {
    var res = 0

    for (c in name) {
        if (c == ' ') {
            res += 10
        } else {
            val scannerRoman = Scanner(File("/home/rhia/code/ASCII Text Signature/Resources/roman.txt"))
            val pattern = Regex("[$c] [0-9]+")

            while (scannerRoman.hasNextLine()) {
                val line = scannerRoman.nextLine()
                if (pattern.matches(line)) {
                    res += line.substringAfter(' ').toInt()
                }
            }

            scannerRoman.close()
        }
    }

    return res
}

fun statusLength(status: String): Int {
    var res = 0

    for (c in status.toUpperCase()) {
        res += when (c) {
            'I' -> 2
            'J' -> 3
            'T' -> 4
            'Y', 'W' -> 6
            else -> 5
        }
    }

    return res
}

private fun printBorder(size: Int) {
    repeat(size) {
        print("8")
    }
    println()
}

fun printName(name: String, status: String) {
    for (i in 1..10) {
        printNameStart(name, status)
        printNameSymbols(name, i)
        printNameEnd(name, status)
    }
}

private fun printNameStart(name: String, status: String) {
    if (nameLength(name) > statusLength(status)) {
        print("88  ")
    } else {
        print("88")
        val spaces = (statusLength(status) + 4 - nameLength(name)) / 2
        repeat(spaces) {
            print(" ")
        }
    }
}

private fun printNameSymbols(name: String, i: Int) {
    for (c in name) {
        if (c == ' ') {
            print("          ")
        } else {

            val scannerRoman = Scanner(File("/home/rhia/code/ASCII Text Signature/Resources/roman.txt"))
            val patternTest = Regex("[${c}] [0-9]+")

            while (scannerRoman.hasNextLine()) {
                val line = scannerRoman.nextLine()
                if (patternTest.matches(line)) {
                    var toPrint = ""
                    repeat(i) {
                        toPrint = scannerRoman.nextLine()
                    }
                    print(toPrint)
                }
            }
        }
    }
}

private fun printNameEnd(name: String, status: String) {
    if (nameLength(name) > statusLength(status)) {
        println("  88")
    } else {
        if (nameLength(name) % 2 != statusLength(status) % 2) {
            val spaces = (statusLength(status) + 4 - nameLength(name)) / 2 + 1
            repeat(spaces) {
                print(" ")
            }
        } else {
            val spaces = (statusLength(status) + 4 - nameLength(name)) / 2
            repeat(spaces) {
                print(" ")
            }
        }
        println("88")
    }
}

fun printStatus(name: String, status: String) {
    for (i in 0..2) {
        printStatusStart(status, name)
        printStatusSymbols(status, i)
        printStatusEnd(status, name)
    }

}

private fun printStatusStart(status: String, name: String) {
    if (statusLength(status) > nameLength(name)) {
        print("88  ")
    } else {
        val spaces = (nameLength(name) + 4 - statusLength(status)) / 2
        print("88")
        repeat(spaces) {
            print(" ")
        }
    }
}

fun printStatusSymbols(status: String, i: Int) {
    for (c in status.toUpperCase()) {
        when (c) {
            ' ' -> print(StatusLetters.SPACE.strings[i])
            else -> print(StatusLetters.valueOf(c.toString()).strings[i])
        }
        print(" ")
    }
}

private fun printStatusEnd(status: String, name: String) {
    if (statusLength(status) > nameLength(name)) {
        print("  88")
    } else {
        if (statusLength(status) % 2 != nameLength(name) % 2) {
            val spaces = (nameLength(name) + 4 - statusLength(status)) / 2 + 1
            repeat(spaces) {
                print(" ")
            }
        } else {
            val spaces = (nameLength(name) + 4 - statusLength(status)) / 2
            repeat(spaces) {
                print(" ")
            }
        }
        print("88")
    }
    println()
}