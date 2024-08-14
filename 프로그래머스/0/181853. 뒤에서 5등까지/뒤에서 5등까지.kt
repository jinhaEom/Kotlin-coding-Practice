class Solution {
    fun solution(num_list: IntArray): IntArray {
        return num_list.sortedArray().take(5).toIntArray()
    }
}