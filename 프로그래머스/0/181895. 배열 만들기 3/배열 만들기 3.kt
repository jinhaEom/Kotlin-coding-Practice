class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in intervals){
            val(s,e) = i
            answer += arr.sliceArray(s..e)
        }
        return answer
    }
}