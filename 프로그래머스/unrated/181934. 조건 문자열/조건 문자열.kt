class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        if ((ineq == "<" && eq == "=" && n <= m) ||
            (ineq == ">" && eq == "=" && n >= m) ||
            (ineq == "<" && eq == "!" && n < m) ||
            (ineq == ">" && eq == "!" && n > m)) {
            return 1
        } else {
            return 0
        }
    }
}
