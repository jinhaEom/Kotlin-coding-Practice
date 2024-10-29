class Solution {
    fun solution(s: String): IntArray {
        val result = IntArray(s.length)
        val lastSeen = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            val char = s[i]
            if (lastSeen.containsKey(char)) {
                result[i] = i - lastSeen[char]!!
            } else {
                result[i] = -1
            }
            lastSeen[char] = i
        }
        
        return result
    }
}
