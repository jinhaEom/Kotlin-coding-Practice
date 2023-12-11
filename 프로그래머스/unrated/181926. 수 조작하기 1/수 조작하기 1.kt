class Solution {
    fun solution(n: Int, control: String): Int {
        var result = n
        for(i in control){
            result = when (i){
                'w' -> result + 1
                's' -> result -1
                'd' -> result + 10
                'a' -> result -10
                else -> result
            }
        }
        return result
    }
}