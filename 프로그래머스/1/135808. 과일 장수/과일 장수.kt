class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0
        score.sortDescending()

        for (i in m - 1 until score.size step m) {
            answer += score[i] * m
        }
        
        return answer
    }
}
