//import javax.xml.stream.events.Characters
//
//fun main() {
//    // write your code here
//    val str = readLine()!!
//    val substr = readLine()!!
//    var count = 0
////   for(i in 0.. str.length) {
////       if(Character.isWhitespace(i))
////           continue
//       if (substr.contentEquals(str)) return
//       count++
////       }
//    println(count)
//}

fun countMatches(string: String, pattern: String): Int {
    return string.split(pattern).toTypedArray().size - 1
}

fun main() {
    val string = readLine()!!
    val pattern = readLine()!!

    val count = countMatches(string, pattern)
    println(count)
}