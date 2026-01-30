class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        val hallOfFame = mutableListOf<Int>()
        
        for(s in score){
            hallOfFame.add(s)
            hallOfFame.sortDescending()
            if(hallOfFame.size > k){
                hallOfFame.removeLast()
            }
            answer.add(hallOfFame.last())
        }
        return answer.toIntArray()
    }
}