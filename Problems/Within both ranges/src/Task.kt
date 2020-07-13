import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    val n = scanner.nextInt()

    if(n in a..b && n in c..d) println("true")
    else println("false")
}
