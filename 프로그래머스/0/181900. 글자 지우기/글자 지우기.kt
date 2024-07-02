class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        val indicesSet = indices.toSet()
        val answer = StringBuilder()

        for (i in my_string.indices) {
            if (i !in indicesSet) {
                answer.append(my_string[i])
            }
        }

        return answer.toString()
    }
}
