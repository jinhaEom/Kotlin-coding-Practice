class Solution {
    fun solution(my_string: String, alp: String): String {
        var result = ""
        for (char in my_string) {
            if (char in alp) {
                result += char.toUpperCase()
            } else {
                result += char
            }
        }
        return result
    }
}
