class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n = num.toLong()
        while(n != 1L){
            if(answer >= 500) return -1
            answer++
            if(n%2 ==0L){
                n = n /2
            }else{
                n = n * 3 + 1
            }
        }
        return answer
    }
}