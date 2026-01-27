class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        var total = 0
        
        val counts = tangerine.asIterable().groupingBy { it }.eachCount()
        
        val sortedCounts = counts.values.sortedDescending()
        
        for (count in sortedCounts) {
            total += count
            answer++
            
            if (total >= k) break
        }
        
        return answer
    }
}