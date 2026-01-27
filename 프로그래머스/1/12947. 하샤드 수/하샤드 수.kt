class Solution {
    fun solution(x: Int): Boolean {
          var result = x.toString().map{it.digitToInt()} //3,3,1
          var result2 = result.sum() // 7
          if(x%result2 == 0) return true else return false
    }
}