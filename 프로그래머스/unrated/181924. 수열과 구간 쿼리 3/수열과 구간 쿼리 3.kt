class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
  
            for(query in queries){
                val i = query[0]
                val j = query[1]
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
                            
            }
        return arr
        
    }
}