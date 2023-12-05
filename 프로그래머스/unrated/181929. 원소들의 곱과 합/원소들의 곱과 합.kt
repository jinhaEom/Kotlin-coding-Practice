class Solution {
    fun solution(num_list: IntArray): Int {
            var product = 1
    var sum = 0

    for (num in num_list) {
        product *= num
        sum += num
    }

    val sumSquared = sum * sum

    return if (product < sumSquared) 1 else 0
}
}
