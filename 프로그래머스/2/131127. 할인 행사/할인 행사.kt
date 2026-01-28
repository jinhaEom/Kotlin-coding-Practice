class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        //내가 원하는 품목과 갯수를 Map으로 만들기
        var wantMap = want.zip(number.toTypedArray()).toMap()
        println(wantMap)
        for(i in 0..discount.size - 10){
            val tenDaysMap = discount.sliceArray(i until i+10).groupingBy{it}.eachCount()
              if(wantMap == tenDaysMap){
            answer++
        }
        }
      
        
        return answer
    }
}