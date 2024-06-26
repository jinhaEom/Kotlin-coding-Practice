class Solution {
    fun solution(ee: String): List<String> {
        val answer = mutableListOf<String>()
        for (start in 0 until ee.length) {
            answer.add(ee.substring(start))
        }
        answer.sort()
        return answer
    }
}
