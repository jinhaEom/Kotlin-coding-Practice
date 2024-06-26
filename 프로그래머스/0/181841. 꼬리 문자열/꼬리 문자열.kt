class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        val answer = StringBuilder()
        for (str in str_list) {
            if (!str.contains(ex)) {
                answer.append(str)
            }
        }
        return answer.toString()
    }
}
