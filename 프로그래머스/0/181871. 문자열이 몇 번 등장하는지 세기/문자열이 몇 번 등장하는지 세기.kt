class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        var index = 0
        
        while(index != -1){
            index = myString.indexOf(pat, index)
            
            if(index != -1){
                answer ++
                index += 1
            }
        }
        return answer
    }
}