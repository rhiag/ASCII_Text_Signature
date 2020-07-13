fun main() {
    // put your code here
    val str = readLine()!!
    var num = 0
    val count = str.groupingBy { it }.eachCount()

    for ((k, v) in count) {
        if (v > 1) {
            continue
        } else {
            num += 1
        }
    }
    println(num)
}
