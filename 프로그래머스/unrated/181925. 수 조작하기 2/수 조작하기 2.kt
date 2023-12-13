class Solution {
    fun solution(numLog: IntArray): String {
    val result = StringBuilder()
    var currentNum = numLog[0]

    for (i in 1 until numLog.size) {
        val diff = numLog[i] - numLog[i - 1]

        when (diff) {
            1 -> result.append('w')
            -1 -> result.append('s')
            10 -> result.append('d')
            -10 -> result.append('a')
        }

        currentNum = numLog[i]
    }

    return result.toString()
}
}