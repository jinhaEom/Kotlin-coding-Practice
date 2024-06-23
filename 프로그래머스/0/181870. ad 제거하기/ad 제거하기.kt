class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        val answer = strArr.filter { !it.contains("ad") }.toTypedArray()
        return answer
    }
}