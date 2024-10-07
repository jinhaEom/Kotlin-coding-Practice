class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for(query in queries){
            val(s,e) = query
            
            for(i in s..e){
                arr[i]++
            }
        }
        return arr
    }
}