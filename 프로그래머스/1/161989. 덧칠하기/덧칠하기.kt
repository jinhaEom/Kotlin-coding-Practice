class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var current = 0
        
        for(i in section){
            if(i > current){
                answer++ 
                current = i + m - 1
            }
        }
        return answer
    }
}