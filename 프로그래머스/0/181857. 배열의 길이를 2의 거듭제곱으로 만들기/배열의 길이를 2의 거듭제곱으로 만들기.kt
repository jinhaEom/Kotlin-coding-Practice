class Solution {
    fun solution(arr: IntArray): IntArray {
        var count = 1
        var size= arr.size
        while(count < size){
            count *= 2
        }
        if(size == count){
           return arr
        }
        var result = arr.copyOf(count)

        return result
    }
}