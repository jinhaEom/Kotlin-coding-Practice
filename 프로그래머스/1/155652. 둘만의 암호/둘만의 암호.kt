class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var skipSet = skip.toSet()
        val alphabet = ('a'..'z').toList()
        var answer = StringBuilder()
        
        for(char in s){
            var shifted = 0 
            var currentIndex = alphabet.indexOf(char)
            
            while(shifted < index){
                currentIndex = (currentIndex + 1) % 26
                if(alphabet[currentIndex] !in skip){
                    shifted++
                }
            }
            answer.append(alphabet[currentIndex])
        }
        return answer.toString()
    }
}