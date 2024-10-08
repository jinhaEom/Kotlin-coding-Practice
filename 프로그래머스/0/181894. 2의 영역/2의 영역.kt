class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val first = arr.indexOfFirst{ it == 2}
        val end = arr.indexOfLast{ it == 2}
        
        return if(first != -1 && end != -1){
            if(arr.slice(first..end).isEmpty()){
                intArrayOf(-1)
            }else{
                arr.slice(first..end).toIntArray()
            }
        }
        else{
            intArrayOf(-1)
        }
    }
}