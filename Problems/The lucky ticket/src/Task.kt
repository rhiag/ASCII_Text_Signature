fun main() {
    // write your code here
    val ticket = readLine()!!
    var part1 = 0
    var part2 = 0

    for(i in 0..2) part1 += ticket[i].toInt()
    for(i in 3..5) part2 += ticket[i].toInt()

    if(part1 == part2) println("Lucky")
    else println("Regular")


}