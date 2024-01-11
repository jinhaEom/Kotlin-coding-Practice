class Solution {
    fun solution(myString: String, pat: String): Int {
        val myString2 = myString.toLowerCase()
        val pat2 = pat.toLowerCase()
         return if(pat2 in myString2){
            1
        }else 0
    }
}