class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var result = mutableListOf<Int>()
        var x = 1
        for(i in 1..n){
            if(n%i==0){
                result +=i
            }
        }
        return result.sum()
    }
}