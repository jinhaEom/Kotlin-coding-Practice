class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        val result = StringBuilder()
        var maxLength = maxOf(str1.length, str2.length)
        
        for(i in 0 until maxLength){
            result.append(str1[i])
            result.append(str2[i])
        }
            return result.toString()

    }
}