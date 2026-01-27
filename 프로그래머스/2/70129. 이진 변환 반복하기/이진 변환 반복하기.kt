class Solution {
    fun solution(s: String): IntArray {
        var currentS = s
        var transformCount = 0 // 변환횟수
    var totalRemoveZeros = 0 
        
        while(currentS!="1"){
            transformCount++
            
            var zeros = currentS.count { it=='0'}
            totalRemoveZeros += zeros
            
            //0제거 후의 길이
            var nextLength = currentS.length - zeros
            
            currentS = Integer.toBinaryString(nextLength)
        }
        return intArrayOf(transformCount , totalRemoveZeros)
    }
}