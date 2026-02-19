class Solution {
    fun solution(s: String): Int {
    var answer = 0
    val n = s.length
    
    val pairMap = mapOf(')' to '(', ']' to '[', '}' to '{')

    for (i in 0 until n) {
        val rotated = s.substring(i) + s.substring(0, i)
        if (isValid(rotated, pairMap)) {
            answer++
        }
    }

    return answer
}  


    fun isValid(str: String, pairMap: Map<Char, Char>) : Boolean {
        val stack = ArrayDeque<Char>()
        
        for(char in str){
            if(char == '(' || char == '[' || char =='{'){
                stack.addLast(char)
            }else{
                if(stack.isEmpty() || stack.last() != pairMap[char]){
                    return false
                }
                stack.removeLast()
            }
        }
        return stack.isEmpty()
    }
}