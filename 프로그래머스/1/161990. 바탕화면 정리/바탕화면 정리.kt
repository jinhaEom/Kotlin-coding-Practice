class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var lux = Int.MAX_VALUE
        var luy = Int.MAX_VALUE
        var rdx = Int.MIN_VALUE
        var rdy = Int.MIN_VALUE
        
        for(i in wallpaper.indices){
            for(j in wallpaper[i].indices){
                if(wallpaper[i][j] == '#'){
                    lux = minOf(lux,i)
                    luy = minOf(luy,j)
                    rdx = maxOf(rdx,i+1)
                    rdy = maxOf(rdy,j+1)
             }
            }
        }
        
        return intArrayOf(lux,luy,rdx,rdy)
    }
}

