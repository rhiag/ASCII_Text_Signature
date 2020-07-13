import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val letter = input.next().single()

    for (l in 'a' until 'z') {
        if(l < letter)
            print(l)

    }
    return
}