class Solution {
    fun solution(food: IntArray): String {
        var answer: String = "" 
        val leftSide = StringBuilder()
        
        for(i in 1 until food.size){
            val half = food[i]/2
            repeat(half){
                leftSide.append(i)
            }
            
        }
        val rightSide = leftSide.toString().reversed()
        return leftSide.toString() + "0" + rightSide   
    }
}