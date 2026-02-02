class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        return strings.sorted().sortedBy{it[n]}.toTypedArray()
    }
}