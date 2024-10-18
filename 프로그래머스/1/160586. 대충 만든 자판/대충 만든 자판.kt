class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val keyPressMap = mutableMapOf<Char, Int>()

        keymap.forEach { keys ->
            keys.forEachIndexed { index, char ->
                keyPressMap[char] = minOf(keyPressMap.getOrDefault(char, Int.MAX_VALUE), index + 1)
            }
        }

        return targets.map { target ->
            var totalPresses = 0
            for (char in target) {
                if (char !in keyPressMap) return@map -1
                totalPresses += keyPressMap[char]!!
            }
            totalPresses
        }.toIntArray()
    }
}
