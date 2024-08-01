class Solution {
    fun solution(number: String): Int {
        var answer = number.sumOf{it.toString().toInt()}
        return answer%9
    }
}