function solution(arr)
{
    var answer = [];

    for(const i of arr){
        if(i !== answer[answer.length -1]){
            answer.push(i)
        }
    }
    
    return answer;
}