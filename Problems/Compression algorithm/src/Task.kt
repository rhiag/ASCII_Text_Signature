fun main() {
    // write your code here

    val dna = readLine()!!
    var dnaCoded = dna.first().toString()
   // println(dnaCoded)
    var count = 0
    for (c in dna) {
        if (dnaCoded.last() == c) {
            count++
        } else {
            dnaCoded += "$count$c"
            count = 1
        }
    }
    println(dnaCoded + count)
}

