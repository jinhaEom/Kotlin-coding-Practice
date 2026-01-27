class Solution {
    fun solution(s: String): String {
        var words = s.split(" ")
        var answer = words.map{word ->
        if(word.isNotEmpty()){
            word.lowercase().replaceFirstChar{it.uppercase()}
        }else{
            word
        }
        
        }
        return answer.joinToString(" ")
    }
}