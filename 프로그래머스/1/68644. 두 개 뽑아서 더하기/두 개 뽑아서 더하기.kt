class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableSetOf<Int>()
        for(number in numbers.indices){
            for(secondNumber in number+1 until numbers.size){
                answer.add(numbers[number]+numbers[secondNumber])
            }
        }
        return answer.sorted().toIntArray()
    }
}