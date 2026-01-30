class Solution {
    fun solution(citations: IntArray): Int {
        val sorted = citations.sortedDescending()
        var hIndex = 0
        
        for(i in sorted.indices){
            if(sorted[i] >= i+1){
                hIndex = i + 1
            }else{
                break
            }
        }
        return hIndex
    }
}