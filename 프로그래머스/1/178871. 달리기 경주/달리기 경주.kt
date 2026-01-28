class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        var posMap = mutableMapOf<String,Int>()
        
        players.forEachIndexed{index, name ->
            posMap[name]= index
        }
        for(calledName in callings){
            val currentIdx = posMap[calledName]!!
            
            val frontIdx = currentIdx -1
            val frontName= players[frontIdx]
            
            players[frontIdx] = calledName
            players[currentIdx] = frontName
            
            posMap[calledName] = frontIdx
            posMap[frontName] = currentIdx
        }
        return players
    }
}