class Solution {
    fun solution(s: String): String {
        val length = s.length
        val mid = length / 2
        
        return if(length % 2==0){
            s.substring(mid- 1, mid + 1)
        }else{
            s.substring(mid, mid + 1)
        }
    }
}