function solution(nums) {
    var answer = 0;
    let map = new Map()
    const totalCount = nums.length/2
    
    for(const num of nums){
        if(map.has(num)){
            map.set(num,map.get(num)+1)
        }else{
            map.set(num,1)
        }
    }
    if(map.size < totalCount){
        return map.size
    }else{
        return totalCount
    }
    
}