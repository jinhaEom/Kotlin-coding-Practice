class Solution {
    fun solution(my_string: String): IntArray {
        var answer = IntArray(52)
        
        for(char in my_string){
            when(char){
                in 'A'..'Z' -> answer[char -'A'] += 1
                in 'a'..'z' -> answer[char-'a'+26] += 1
            }
        }
        return answer
    }
}