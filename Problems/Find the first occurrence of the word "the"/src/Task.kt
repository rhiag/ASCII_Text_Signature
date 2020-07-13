fun main() {
    // write your code here
    val sentence = readLine()!!.toLowerCase()
   if("the" in sentence) {
        println(sentence.indexOf("the"))
    }else
       println("-1")

}