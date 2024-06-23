 class Solution {
     fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
         var answer: IntArray = intArrayOf()
         queries.forEach{
             var temp = arr.sliceArray(it[0] .. it[1]).sortedArray()
             var num = -1
             for(i in 0 .. temp.size-1){
                 if(temp[i] > it[2]){
                     num = temp[i]
                     break
                 }
             }
             answer += num
         }
         return answer
     }
 }
