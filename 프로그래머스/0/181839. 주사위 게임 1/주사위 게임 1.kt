import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        if ((a % 2 == 0) && (b % 2 == 0)) {
            answer = abs(a-b)
        } else if ((a % 2 != 0) && (b % 2 != 0)) {
             answer = (a * a) + (b * b)
        } else {
          answer = 2 * (a + b)


        }
        return answer
    }
}
