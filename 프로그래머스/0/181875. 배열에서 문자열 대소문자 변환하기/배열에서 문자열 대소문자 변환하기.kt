class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        val answer = Array(strArr.size) { "" }
        
        for (i in strArr.indices) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase()
            } else {
                answer[i] = strArr[i].toUpperCase()
            }
        }
        
        return answer
    }
}