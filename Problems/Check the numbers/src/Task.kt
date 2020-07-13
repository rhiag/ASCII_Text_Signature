import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val size = scanner.nextInt()
    val array = IntArray(size)
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val state = checkNumbers(array,n,m)
    if (state) println("NO")
    else println("YES")
}

fun checkNumbers(array: IntArray,n:Int,m:Int): Boolean {
   // val s = array.size -1
    var status = false
    for(i in 0..array.lastIndex-1) {
        if ((array[i] == n && array[i + 1] == m) || (array[i] == m && array[i + 1] == n))
            status = true
            }
    return status
}