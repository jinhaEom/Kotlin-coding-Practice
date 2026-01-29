class Solution {
    fun solution(s: String): String {
        var answer = s.toList().map{it.toInt()}.sortedDescending()
        var result = answer.map{it.toChar()}.joinToString("")
        
        return result
    }
}