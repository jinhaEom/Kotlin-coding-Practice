class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        return arr.mapIndexed { index, value ->
            if ((arr.size % 2 == 1 && index % 2 == 0) ||  
                (arr.size % 2 == 0 && index % 2 == 1)) { 
                value + n
            } else {
                value
            }
        }.toIntArray()
    }
}
