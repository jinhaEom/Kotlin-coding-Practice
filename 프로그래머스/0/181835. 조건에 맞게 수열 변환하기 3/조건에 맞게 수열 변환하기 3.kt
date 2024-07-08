class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer = IntArray(arr.size)

        for(i in arr.indices) {
            if (k % 2 != 0) {
                answer[i] = arr[i] * k
            } else {
                answer[i] = arr[i] + k
            }
        }
        return answer
    }
}
