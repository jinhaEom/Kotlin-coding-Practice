class Solution {
    fun solution(myString: String): Array<String> {
        return myString.split('x')  
            .map { it.trim() }      
            .filter { it.isNotEmpty() }
            .sorted()         
            .toTypedArray()     
    }
}
