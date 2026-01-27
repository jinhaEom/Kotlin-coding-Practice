
class Solution {
    fun solution(s: String): String {
    var numbers = s.split(" ").map{ it.toInt()}
        var max = numbers.maxOrNull()
        var min = numbers.minOrNull()
        return "${min} ${max}"
    }
}