class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        var letterLen = (s.length==4 || s.length == 6)
        
        return letterLen && s.all{it.isDigit()}
    }
}