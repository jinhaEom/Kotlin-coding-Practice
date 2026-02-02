class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        for(command in commands){
            var(start,end,k) = command
            var result = array.sliceArray(start-1 until end)
            result.sort()
            println(result.joinToString())
            answer+= result[k-1]

        }
        return answer
    }
}