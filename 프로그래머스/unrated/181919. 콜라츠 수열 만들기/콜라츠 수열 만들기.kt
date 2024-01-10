class Solution {
    fun solution(n: Int): IntArray {
     
        var x = n
        var result = mutableListOf<Int>()
        
        while(x!=1){
            result.add(x)
            x = if(x%2==0){
                x/2
            }else{
                x*3+1
            }
        }
        result.add(1)
        return result.toIntArray()
    }
}