class Solution {
    fun solution(num_list: IntArray): Long {
        var answer: Long = 1
        if(num_list.size >= 11){
            answer = num_list.sum().toLong()
        } else {
            for (num in num_list) {
                answer *= num
            }
        }
        return answer
    }
}
