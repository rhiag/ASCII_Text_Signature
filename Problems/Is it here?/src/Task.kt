import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val N = scanner.nextInt()
    val array = IntArray(N)
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    val M = scanner.nextInt()
    var state  = false

    if ( M in array) println("YES")
    else println("NO")

//     for (i in 0..array.lastIndex){
//         if(array[i]== M) state = true
//         else state = false
//       }
//
//    if (state == true) {
//               println("YES")
//    }
//    else  println("NO")

    }