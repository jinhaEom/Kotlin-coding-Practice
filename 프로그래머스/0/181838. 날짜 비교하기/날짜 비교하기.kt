class Solution {
    fun solution(date1: IntArray, date2: IntArray): Int {
        val date1Value = date1[0] * 10000 + date1[1] * 100 + date1[2]
        val date2Value = date2[0] * 10000 + date2[1] * 100 + date2[2]
        
        return if (date1Value < date2Value) 1 else 0
    }
}
