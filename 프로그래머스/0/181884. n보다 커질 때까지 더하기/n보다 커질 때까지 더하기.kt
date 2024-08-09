class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var sum = 0
        for (i in numbers.toList()){
                sum += i
            if(sum > n){
                break
            }
            
        }
        return sum
    }
}