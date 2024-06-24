class Solution {
    fun solution(arr: Array<String>, parts: Array<IntArray>): String {
        var result: String = ""
        
        for(i in arr.indices){
            val(s,e) = parts[i]
            result += arr[i].substring(s,e+1)
        }
        return result
    }
}