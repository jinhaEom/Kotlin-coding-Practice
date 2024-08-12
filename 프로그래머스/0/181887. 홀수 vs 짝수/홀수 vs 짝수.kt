class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd = num_list.filterIndexed{ index,_ -> index % 2 == 0}.sum()
        var even = num_list.filterIndexed{index,_ -> index%2 != 0}.sum()
        
        return maxOf(odd, even)
    }
}