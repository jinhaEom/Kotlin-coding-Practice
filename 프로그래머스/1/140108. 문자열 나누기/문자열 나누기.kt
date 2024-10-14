class Solution {
    fun solution(s: String): Int {
    var count = 0
    var i = 0

    while (i < s.length) {
        var xCount = 0
        var otherCount = 0
        val x = s[i]
        while (i < s.length) {
            if (s[i] == x) {
                xCount++
            } else {
                otherCount++
            }
            i++
            if (xCount == otherCount) {
                break
            }
        }
        count++
    }

    return count
}

}