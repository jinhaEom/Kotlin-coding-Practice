class Solution {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        for(i in num_str.indices){
            answer += num_str[i].toString().toInt()
        }
        return answer
    }
}