class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        val sum = a + b + c
        val squareSum = a * a + b * b + c * c
        val cubeSum = a * a * a + b * b * b + c * c * c

        return when {
            a == b && b == c -> sum * squareSum * cubeSum
            ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) -> sum * squareSum
            else -> sum
        }
    }
}
