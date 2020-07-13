fun main() {
    // write your code here
    val seq = readLine()!!
    var count = 0

    for(ch in seq) {
        when (ch.toLowerCase()) {
            'c','g' -> count++
        }
    }
     println(count.toDouble() /seq.length  * 100)


}