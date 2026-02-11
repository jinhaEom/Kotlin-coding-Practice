class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        return s.split(" ").map { word ->
            word.lowercase().replaceFirstChar{ it.uppercase()}
        }.joinToString(" ")
    }
}