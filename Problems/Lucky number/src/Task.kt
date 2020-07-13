fun main() {
    // write your code here
    val N = readLine()!!
    val s = N.length /2
    var sum1 = 0
    var sum2 = 0

    for (i in 0 until s){
        sum1 += (N[i]).toInt()
    }
    for(i in s until N.length){
        sum2 += (N[i]).toInt()
    }
    if(sum1 == sum2) println("YES")
    else println("NO")

}
