fun main(args: Array<String>) {
    val s1 = readLine()!!
    var result = ""
    
    for(char in s1){
        result += if (char.isLowerCase()) {
            char.toUpperCase()
        }else{
            char.toLowerCase()
        }
    }
    println(result)
}