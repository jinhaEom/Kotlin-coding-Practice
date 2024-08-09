class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer= StringBuilder()
        for(i in 0 until my_string.length step m){
            if(i+c-1 <my_string.length){
                answer.append(my_string[i+c-1])
            }
        }
        return answer.toString()
    }
}