class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
            return num_list.foldIndexed(mutableListOf<Int>()){index, acc, value ->
                if(index % n == 0) acc.add(value)
                acc
            }.toIntArray()
        }
    }
