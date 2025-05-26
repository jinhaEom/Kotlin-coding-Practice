function solution(a, b) {
    var astring = a.toString()
    var bstring = b.toString()
     
    var answer = 0;
    if(astring+bstring < bstring+astring){
        return Math.max(bstring+astring)
    }else{
        return Math.max(astring+bstring)
    }
}