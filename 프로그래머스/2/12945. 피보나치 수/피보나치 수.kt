class Solution {
    fun solution(n: Int): Int {
        if (n <= 1) return n
        
        val fib = IntArray(n + 1)
        fib[0] = 0
        fib[1] = 1
        
        for (i in 2..n) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567
        }
        
        return fib[n]
    }
}