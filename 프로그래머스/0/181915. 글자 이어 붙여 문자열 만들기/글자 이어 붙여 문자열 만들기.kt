class Solution {
    fun solution(ee: String, indices: IntArray): String {
        var answer = ""
        for (i in indices) {
            if (i < ee.length) { 
                answer += ee[i]
            }
        }
        return answer
    }
}
