class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var result = a.zip(b).sumOf{it.first * it.second}
        
        return result
    }
}