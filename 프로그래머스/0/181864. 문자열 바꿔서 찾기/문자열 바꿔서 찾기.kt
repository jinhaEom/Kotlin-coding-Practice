class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer = myString.map{
            when(it){
                'A' -> 'B'
                'B' -> 'A'
                else -> it
            }
        }.joinToString("")
        
        return if(answer.contains(pat)){
            1
        }else{
            0
        }
    }
}