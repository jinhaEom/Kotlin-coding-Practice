class Solution {
    fun solution(q: Int, r: Int, code: String): String {
    val result = StringBuilder()
      
    for (i in code.indices) {
        if (i % q == r) {
            result.append(code[i])
        }
    }
    
        return result.toString()
    }
}