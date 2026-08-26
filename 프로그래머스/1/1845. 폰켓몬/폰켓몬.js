function solution(nums) {
    var answer = new Map();
    const numLen = nums.length /2;
    
    for(const num of nums){
        if(answer.get(num) === 0){
          answer.set(num,answer.get(num)+1)
            console.log(answer)
        }else{
          answer.set(num,1)
        }
    }
    if(answer.size < nums.length/2){
        return answer.size
    }else{
        return nums.length/2
    }
}