class Solution {
    fun solution(arr: IntArray): IntArray {
        for (i in arr.indices) {
            val ind = arr[i]
            if(ind>=50 && ind%2 ==0) arr[i]= ind/2 
            else if(ind<50 && ind%2 !=0) arr[i]= ind*2
            
        }
        return arr
    }
}