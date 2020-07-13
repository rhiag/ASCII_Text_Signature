import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val N = scanner.nextInt()

    val array = IntArray(N)
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    println(array.min())

}