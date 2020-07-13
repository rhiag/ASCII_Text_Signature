import java.util.*

fun main() {
    // write your code here
    val word = readLine()!!
    var vowels = 0
    var consonants = 0
    var result = 0


    for (i in 0 until word.lastIndex) {
        if (isVowel(word[i])) {
            vowels++
            consonants = 0
//            println("Vowels: $vowels")
//            println("Consonents: $consonants")
        } else {
            vowels = 0
            consonants++
//            println("Vowels: $vowels")
//            println("Consonents: $consonants")
        }
        if (vowels == 3) {
            result++
            vowels = 1
        }
        if (consonants == 3) {
            result++
            consonants = 1
        }
    }
    println("$result")
}

fun isVowel(c:Char): Boolean {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') return true
    else return false
}









