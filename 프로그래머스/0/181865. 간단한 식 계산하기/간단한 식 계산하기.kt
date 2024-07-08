class Solution {
    fun solution(binomial: String): Int {
        var parts = binomial.split("+","-","*")
        
        val firstNum = parts[0].trim().toInt()
        val secondNum = parts[1].trim().toInt()
        val operator = binomial.filter { it =='+' || it =='-' || it == '*'}
        var answer : Int = 0
        
        when(operator){
            "+" -> answer = firstNum + secondNum
            "-" -> answer = firstNum - secondNum
            "*" -> answer = firstNum * secondNum

        }
        return answer
    }
}