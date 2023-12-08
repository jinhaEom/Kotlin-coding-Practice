class Solution {
    fun solution(num_list: IntArray): IntArray {
        val result = num_list.toMutableList()

        val lastIndex = result.size - 1
        if (lastIndex > 0 && result[lastIndex] > result[lastIndex - 1]) {
            result.add(result[lastIndex] - result[lastIndex - 1])
        } else {
            result.add(result[lastIndex] * 2)
        }

        return result.toIntArray()
    }
}