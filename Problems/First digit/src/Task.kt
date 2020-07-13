fun main() {
     // put your code here
 val word = readLine()
 val c = word?.toCharArray()
    var flag = false
    if (c != null) {
        for(i in 0..c.size){
            if(c[i] in '0'..'9'){
                flag = true
                println(c[i])
                break
            }

        }
    }


}