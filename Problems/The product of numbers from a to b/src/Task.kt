import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var product: Long = 1

    for (i in a until b){
        product = product * i
    }

    println(product)
}