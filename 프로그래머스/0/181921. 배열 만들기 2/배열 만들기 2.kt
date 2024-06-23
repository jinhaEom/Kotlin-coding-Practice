class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
       
       var result = (l .. r).filter{
                      it.toString().all { char -> char == '0' || char == '5' }

       }
       return if(result.isEmpty()){
           intArrayOf(-1)
       }else{
           result.toIntArray()
       }
    }
}