class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var result = 0  // 초기값을 0으로 초기화
        
        for (i in included.indices) {
            if (included[i] == true) {
                result += (a + i * d)
            }
        }
        return result
    }
}
