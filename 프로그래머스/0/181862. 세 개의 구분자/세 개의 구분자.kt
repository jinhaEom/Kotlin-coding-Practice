class Solution {
    fun solution(myStr: String): Array<String> {
        val result = myStr.split("a","b","c").filter {it.isNotEmpty()}.toTypedArray()
        return if(result.isNotEmpty()) result else arrayOf("EMPTY")
    }
}