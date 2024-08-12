class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        var before = my_string.substring(0,s)
        var reverse = my_string.substring(s,e+1).reversed()
        var after = my_string.substring(e+1)
        
        return before + reverse + after
    }
}