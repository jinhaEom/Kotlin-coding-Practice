class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var currentK = k
        var answer: IntArray = intArrayOf()
        while(n >= currentK){
            answer += currentK
            currentK += k
        }
        return answer
    }
}