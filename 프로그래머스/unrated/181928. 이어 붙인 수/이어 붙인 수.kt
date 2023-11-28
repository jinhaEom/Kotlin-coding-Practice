class Solution {
    fun solution(num_list: IntArray): Int {
        val oddList = arrayListOf<Int>()
        val evenList = arrayListOf<Int>()
        
        for(num in num_list){
            if(num %2 == 0){
                evenList.add(num)
            }else{
                oddList.add(num)
            }
        }
        val a = evenList.joinToString("").toInt()
        val b = oddList.joinToString("").toInt()
        return a+b
    }
}