class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        return arr.filterNot{it in delete_list}.toIntArray()
    }
}