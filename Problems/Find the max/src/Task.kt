import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    //read an num of element
    val N = scanner.nextInt()
    val array = IntArray(N)
    // read array
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    // find max in the array
    val maximum = array.max()
    //find first occurrence of max value
    val a = array.indexOf(maximum!!)
    println(a)

}