class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode : Boolean = true
        for(i in 0 .. code.length-1){
            if(code[i] == '1') {
                mode = !mode
                continue
            }
            if(mode){ 
                if(i%2 == 0) answer += code[i].toString()
            }else { 
                if(i%2 == 1) answer += code[i].toString()
            }
        }
        if(answer == "") answer += "EMPTY"
        return answer
    }
}