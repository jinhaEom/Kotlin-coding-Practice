class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer = StringBuilder()
        
        answer.append(my_string.substring(0,n))
   
        return answer.toString()
    }
}