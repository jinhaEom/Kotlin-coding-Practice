class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var pSize = p.length
        var pValie = p.toLong()
        
        var tSlice = t.windowed(pSize,1)
        tSlice.forEach { 
            if(it <= p){
                answer += 1
            }
        }
    
        return answer
    }
}