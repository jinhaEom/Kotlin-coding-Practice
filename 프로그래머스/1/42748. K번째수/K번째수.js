function solution(array, commands) {
    var answer = [];
    for(const command of commands){
        const [i,j,k] = command
        const sliced =array.slice(i-1,j)
        
        sliced.sort((a,b) => a-b)
        
        console.log(sliced)
        
        answer.push(sliced[k-1])
    }
    return answer;
}