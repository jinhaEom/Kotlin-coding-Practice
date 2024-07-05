class Solution {
    fun solution(num_list: IntArray): IntArray {
        val sortedList = num_list.sorted()
        return sortedList.drop(5).toIntArray()
    }
}
