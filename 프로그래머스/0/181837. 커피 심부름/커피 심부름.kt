class Solution {
    fun solution(order: Array<String>): Int {
        return order.map { item ->
            when {
                item.contains("americano") || item == "anything" -> 4500
                item.contains("cafelatte") -> 5000
                else -> 0
            }
        }.sum()
    }
}
